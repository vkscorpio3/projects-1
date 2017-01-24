define(
  //-------------------------------------------------------------------
  // PACKAGE NAME
  //-------------------------------------------------------------------
  //-------------------------------------------------------------------
  // DEPENDENCIESS
  //-------------------------------------------------------------------
  ['knockout', 'pubsub', 'CCi18n'],

  //-------------------------------------------------------------------
  // MODULE DEFINITION
  //-------------------------------------------------------------------
  function(ko, pubsub, CCi18n) {

    "use strict";

    /**
     * WIDGET CONSTANTS
     */
    // meta tag attribute names
    var META_ATTR_CONSTANT_PROPERTY = "property";
    var META_ATTR_CONSTANT_NAME = "name";
    var META_ATTR_CONSTANT_ITEMPROP = "itemprop";
    // Open Graph Product Availability enums #https://developers.facebook.com/docs/reference/opengraph/object-type/product/
    var OG_PRODUCT_AVAILABILITY_ENUM_INSTOCK = "instock";
    var OG_PRODUCT_AVAILABILITY_ENUM_OUTOFSTOCK = "oos";
    
    /**
     * Adds a new  meta tag to the document head section
     * @param {String} property The value for the property attribute
     * @param {String} content  The value for the content attribute
     */
    var addMetaTag = function(attribute, value, content) {
      var meta = document.createElement('meta');
      meta.setAttribute(attribute, value);
      meta.setAttribute("content", content);
      document.getElementsByTagName('head')[0].appendChild(meta);
    };

    /**
     * Returns a meta tag with a given attribute value
     * @param  {String} attribute Name of the attribute
     * @param  {String} value     Value of the attribute
     * @return {Object}           The meta tag element
     */
    var findMetaTag = function(attribute, value) {
      var metaTags = document.getElementsByTagName("meta"),
        tag = null;
      for (var i = 0; i < metaTags.length; i++) {
        if (metaTags[i].getAttribute(attribute) == value) {
          tag = metaTags[i];
          break;
        }
      }
      return tag;
    };

    var removeMetaTag = function (attribute, value) {
      var tag = findMetaTag(attribute, value);
      if (tag) {
        document.getElementsByTagName('head')[0].removeChild(tag);
      }
    };

    /**
     * Returns an open graph meta tag containing a given property value
     * @param  {String} value property value of the tag (og:title)
     * @return {Object}       The meta tag element if it exists, otherwise null
     */
    var findOGTag = function(value) {
      return findMetaTag(META_ATTR_CONSTANT_PROPERTY, value);
    };

    /**
     * Returns true if an open graph tag containing the given property value exists
     * @param  {String} value tag property value
     * @return {Boolean}       true or false if the tag exists
     */
    var ogTagExists = function(value) {
      if (findOGTag(value) !== null) {
        return true;
      } else {
        return false;
      }
    };

    /**
     * Returns true if a meta tag containing the given property value exists
     * @param  {String} value tag property value
     * @return {Boolean}       true or false if the tag exists
     */
    var tagExists = function(attribute, value) {
      if (findMetaTag(attribute, value) !== null) {
        return true;
      } else {
        return false;
      }
    };

    /**
     * Updates the given meta tag with new content
     * @param {String} value The property value of the tag to be updated
     * @param {String} content The content property to be set on the tag
     */
    var updateTag = function(attribute, value, content) {
      $("meta["+attribute+"='" + value + "']").attr("content", content);
    };

    /**
     * Creates or updates a meta tag having the given property
     * value and content.
     * @param {String} attribute The attribute of the tag to be updated
     * @param {String} value The property value of the tag to be updated
     * @param {String} value The content property to be set on the tag
     * */
    var addOrUpdateMetaTag = function(attribute, value, content) {
      if (!tagExists(attribute,value)) {
        addMetaTag(attribute, value, content);
      } else {
        updateTag(attribute, value, content);
      }
    };


    /**
     * Returns the protocol and host of the current site. http://site.com:8080
     */
    var getProtocolAndHost = function() {
      return window.location.protocol + "//" + window.location.host;
    };

    /**
     * Returns the canonical url to a given product on this site.
     * Returns / if product is not set
     */
    var getCanonicalProductUrl = function(uproduct) {
      if (!uproduct) return "/";
      return getProtocolAndHost() + uproduct.route();
    };

     var getSmallProductImage = function(uproduct) {
      return getProtocolAndHost() + uproduct.primarySmallImageURL();
     };

     /**
      * Returns availability for the given product as one of
      * "in stock"
      * or
      * "out of stock"
      * @param  {Object} uproduct The product to check availability on
      * @return {String}          availability of the product
      */
     var getProductAvailability = function(uproduct) {
      var availability = OG_PRODUCT_AVAILABILITY_ENUM_INSTOCK;
      var stockInfo = uproduct.stockStatus();
      if (stockInfo) {
          if ("IN_STOCK" == stockInfo.stockStatus) {
            availability = OG_PRODUCT_AVAILABILITY_ENUM_INSTOCK;
          } else {
            availability = OG_PRODUCT_AVAILABILITY_ENUM_OUTOFSTOCK;
          }
      }
      return availability;
     };
     
    /**
     * Add Open Graph Meta tags 
     */
    var addOpenGraphTags = function(uproduct, site) {
      
      // og:type
      if (!ogTagExists("og:type")) {
        addMetaTag(META_ATTR_CONSTANT_PROPERTY, "og:type", "product");
      }
      
      // og:title
      addOrUpdateMetaTag(META_ATTR_CONSTANT_PROPERTY, "og:title", CCi18n.t('ns.productsocialmetatags:resources.openGraphTitle', {
          productDisplayName : uproduct.displayName()
        }
      ));     
            
      // og:description
      addOrUpdateMetaTag(META_ATTR_CONSTANT_PROPERTY, "og:description", CCi18n.t('ns.productsocialmetatags:resources.openGraphDescription', {
          productDescription : uproduct.description()
        }
      ));

      // og:url
      addOrUpdateMetaTag(META_ATTR_CONSTANT_PROPERTY, "og:url", getCanonicalProductUrl(uproduct));

      // og:image
      addOrUpdateMetaTag(META_ATTR_CONSTANT_PROPERTY, "og:image", getSmallProductImage(uproduct));
      
      // og:site_name
      addOrUpdateMetaTag(META_ATTR_CONSTANT_PROPERTY, "og:site_name", site.siteInfo.name);

      // product:price:amount
      addOrUpdateMetaTag(META_ATTR_CONSTANT_PROPERTY, "product:price:amount", uproduct.getMinimumPrice());

      // og:price:standard_amount
      addOrUpdateMetaTag(META_ATTR_CONSTANT_PROPERTY, "og:price:standard_amount", uproduct.listPrice());

      // product:price:currency
      addOrUpdateMetaTag(META_ATTR_CONSTANT_PROPERTY, "product:price:currency", site.selectedPriceListGroup().currency.currencyCode);

      // og:brand
      addOrUpdateMetaTag(META_ATTR_CONSTANT_PROPERTY, "og:brand", uproduct.brand());
      
      // og:availability
      addOrUpdateMetaTag(META_ATTR_CONSTANT_PROPERTY, "og:availability", getProductAvailability(uproduct));
    };

    /**
     * Remove Open Graph Meta tags
     */
    var removeOpenGraphTags = function() {
      removeMetaTag(META_ATTR_CONSTANT_PROPERTY,"og:type");
      removeMetaTag(META_ATTR_CONSTANT_PROPERTY,"og:title");
      removeMetaTag(META_ATTR_CONSTANT_PROPERTY,"og:description");
      removeMetaTag(META_ATTR_CONSTANT_PROPERTY,"og:url");
      removeMetaTag(META_ATTR_CONSTANT_PROPERTY,"og:image");
      removeMetaTag(META_ATTR_CONSTANT_PROPERTY,"og:site_name");
      removeMetaTag(META_ATTR_CONSTANT_PROPERTY,"product:price:amount");
      removeMetaTag(META_ATTR_CONSTANT_PROPERTY,"og:price:standard_amount");
      removeMetaTag(META_ATTR_CONSTANT_PROPERTY,"product:price:currency");
      removeMetaTag(META_ATTR_CONSTANT_PROPERTY,"og:brand");
      removeMetaTag(META_ATTR_CONSTANT_PROPERTY,"og:availability");
    };

    /**
     * Adds twitter card meta tags to the page for the given product
     * @param {Object} product The product for which to generate a twitter card
     */
    var addTwitterCard = function(uproduct, site, tHandle) {
        // twitter:card
        addOrUpdateMetaTag(META_ATTR_CONSTANT_NAME,"twitter:card","summary_large_image");
        
        // twitter:site
        if (tHandle && typeof tHandle === 'function' && tHandle() !== '') {
          addOrUpdateMetaTag(META_ATTR_CONSTANT_NAME,"twitter:site",tHandle());  
        }
        
        // twitter:title
        addOrUpdateMetaTag(META_ATTR_CONSTANT_NAME,"twitter:title", CCi18n.t('ns.productsocialmetatags:resources.twitterCardTitle', {
          productDisplayName : uproduct.displayName()
        }
        ));
        
        // twitter:description
        addOrUpdateMetaTag(META_ATTR_CONSTANT_NAME,"twitter:description", CCi18n.t('ns.productsocialmetatags:resources.twitterCardDescription', {
          productDescription : uproduct.description()
        }
        ));
        
        // twitter:url
        addOrUpdateMetaTag(META_ATTR_CONSTANT_NAME,"twitter:url",getCanonicalProductUrl(uproduct));
        
        // twitter:image
        addOrUpdateMetaTag(META_ATTR_CONSTANT_NAME,"twitter:image", getSmallProductImage(uproduct));
    };

    /**
     * Removes all twitter card meta tags
     */
    var removeTwitterCard = function() {
        removeMetaTag(META_ATTR_CONSTANT_NAME,"twitter:card");
        removeMetaTag(META_ATTR_CONSTANT_NAME,"twitter:site");
        removeMetaTag(META_ATTR_CONSTANT_NAME,"twitter:url");
        removeMetaTag(META_ATTR_CONSTANT_NAME,"twitter:title");
        removeMetaTag(META_ATTR_CONSTANT_NAME,"twitter:description");
        removeMetaTag(META_ATTR_CONSTANT_NAME,"twitter:image");
    };
    
    /** 
     * add schema.org microdata attributes 
     */
    var addSchemaDotOrgMicrodata = function(uproduct) {
      var htmlTag = document.getElementsByTagName('html');
      if ( htmlTag && htmlTag.length > 0 ) {
        htmlTag[0].setAttribute('itemscope', '');
        htmlTag[0].setAttribute('itemtype', 'http://schema.org/Product');
      }
      
      // microdata:name
      addOrUpdateMetaTag(META_ATTR_CONSTANT_ITEMPROP,"name", CCi18n.t('ns.productsocialmetatags:resources.schemaDotOrgName', {
        productDisplayName : uproduct.displayName()
      })
      );
      
      // microdata:description
      addOrUpdateMetaTag(META_ATTR_CONSTANT_ITEMPROP,"description", CCi18n.t('ns.productsocialmetatags:resources.schemaDotOrgDescription', {
        productDescription : uproduct.description()
      })
      );
      
      // microdata:brand
      addOrUpdateMetaTag(META_ATTR_CONSTANT_ITEMPROP,"brand", uproduct.brand());
      
      // microdata:image
      addOrUpdateMetaTag(META_ATTR_CONSTANT_ITEMPROP,"image", getSmallProductImage(uproduct));
    };
    
    /** 
     * remove schema.org microdata attributes 
     */
    var removeSchemaDotOrgMicrodata = function() {
      var htmlTag = document.getElementsByTagName('html');
      if ( htmlTag && htmlTag.length > 0 ) {
        htmlTag[0].removeAttribute('itemscope');
        htmlTag[0].removeAttribute('itemtype');
      }
      removeMetaTag(META_ATTR_CONSTANT_ITEMPROP,"name");
      removeMetaTag(META_ATTR_CONSTANT_ITEMPROP,"description");
      removeMetaTag(META_ATTR_CONSTANT_ITEMPROP,"brand");
      removeMetaTag(META_ATTR_CONSTANT_ITEMPROP,"image");
    };
    
    
    var removeMetaTags = function() {
      removeOpenGraphTags();
      removeTwitterCard();
      removeSchemaDotOrgMicrodata();
    };
    
    return {
      /**
       * Called when this widget is first loaded
       * @param  {Object} widget The widget instance
       */
      onLoad: function(widget) {
        $.Topic(pubsub.topicNames.PAGE_CHANGED).subscribe(function(page) {
          removeMetaTags();
        });
      },
      /**
       * Called when this widget is about to appear on a page
       * @param  {Object} page The page view model the widget is about to appear on
       */
      beforeAppear: function(page) {

        if (page.pageId === "product") {
          var uproduct = ko.utils.unwrapObservable(this.product);
          var tHandle;
          if (this.hasOwnProperty('twitterHandle')) {
            tHandle = this.twitterHandle;
          }
          if (uproduct) {
            var usite = ko.utils.unwrapObservable(this.site);
            // Delay Adding Tags till we get stock status back
            var subscription = uproduct.stockStatus.subscribe(function(newValue) {
              addOpenGraphTags(uproduct, usite);
              addTwitterCard(uproduct, usite, tHandle);
              addSchemaDotOrgMicrodata(uproduct);
              // don't leak subscriptions, clean up now
              subscription.dispose();
            });
          }
        } 
        else {
          removeMetaTags();
        }
      }
    };

  }
);
