//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.10 at 05:31:30 PM PDT 
//


package com.google.checkout.schema._2.impl;

public class ItemImpl implements com.google.checkout.schema._2.Item, com.sun.xml.bind.JAXBObject, com.google.checkout.schema._2.impl.runtime.UnmarshallableObject, com.google.checkout.schema._2.impl.runtime.XMLSerializable, com.google.checkout.schema._2.impl.runtime.ValidatableObject
{

    protected com.google.checkout.schema._2.AnyType _MerchantPrivateItemData;
    protected java.lang.String _ItemDescription;
    protected java.lang.String _ItemName;
    protected java.lang.String _TaxTableSelector;
    protected com.google.checkout.schema._2.Money _UnitPrice;
    protected boolean has_Quantity;
    protected int _Quantity;
    public final static java.lang.Class version = (com.google.checkout.schema._2.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.google.checkout.schema._2.Item.class);
    }

    public com.google.checkout.schema._2.AnyType getMerchantPrivateItemData() {
        return _MerchantPrivateItemData;
    }

    public void setMerchantPrivateItemData(com.google.checkout.schema._2.AnyType value) {
        _MerchantPrivateItemData = value;
    }

    public java.lang.String getItemDescription() {
        return _ItemDescription;
    }

    public void setItemDescription(java.lang.String value) {
        _ItemDescription = value;
    }

    public java.lang.String getItemName() {
        return _ItemName;
    }

    public void setItemName(java.lang.String value) {
        _ItemName = value;
    }

    public java.lang.String getTaxTableSelector() {
        return _TaxTableSelector;
    }

    public void setTaxTableSelector(java.lang.String value) {
        _TaxTableSelector = value;
    }

    public com.google.checkout.schema._2.Money getUnitPrice() {
        return _UnitPrice;
    }

    public void setUnitPrice(com.google.checkout.schema._2.Money value) {
        _UnitPrice = value;
    }

    public int getQuantity() {
        return _Quantity;
    }

    public void setQuantity(int value) {
        _Quantity = value;
        has_Quantity = true;
    }

    public com.google.checkout.schema._2.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.google.checkout.schema._2.impl.runtime.UnmarshallingContext context) {
        return new com.google.checkout.schema._2.impl.ItemImpl.Unmarshaller(context);
    }

    public void serializeBody(com.google.checkout.schema._2.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (!has_Quantity) {
            context.reportError(com.sun.xml.bind.serializer.Util.createMissingObjectError(this, "Quantity"));
        }
        context.startElement("http://checkout.google.com/schema/2", "item-description");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _ItemDescription), "ItemDescription");
        } catch (java.lang.Exception e) {
            com.google.checkout.schema._2.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        context.startElement("http://checkout.google.com/schema/2", "item-name");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _ItemName), "ItemName");
        } catch (java.lang.Exception e) {
            com.google.checkout.schema._2.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        if (_MerchantPrivateItemData!= null) {
            context.startElement("http://checkout.google.com/schema/2", "merchant-private-item-data");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _MerchantPrivateItemData), "MerchantPrivateItemData");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _MerchantPrivateItemData), "MerchantPrivateItemData");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _MerchantPrivateItemData), "MerchantPrivateItemData");
            context.endElement();
        }
        context.startElement("http://checkout.google.com/schema/2", "quantity");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(javax.xml.bind.DatatypeConverter.printInt(((int) _Quantity)), "Quantity");
        } catch (java.lang.Exception e) {
            com.google.checkout.schema._2.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        if (_TaxTableSelector!= null) {
            context.startElement("http://checkout.google.com/schema/2", "tax-table-selector");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _TaxTableSelector), "TaxTableSelector");
            } catch (java.lang.Exception e) {
                com.google.checkout.schema._2.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        context.startElement("http://checkout.google.com/schema/2", "unit-price");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _UnitPrice), "UnitPrice");
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _UnitPrice), "UnitPrice");
        context.endAttributes();
        context.childAsBody(((com.sun.xml.bind.JAXBObject) _UnitPrice), "UnitPrice");
        context.endElement();
    }

    public void serializeAttributes(com.google.checkout.schema._2.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (!has_Quantity) {
            context.reportError(com.sun.xml.bind.serializer.Util.createMissingObjectError(this, "Quantity"));
        }
    }

    public void serializeURIs(com.google.checkout.schema._2.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (!has_Quantity) {
            context.reportError(com.sun.xml.bind.serializer.Util.createMissingObjectError(this, "Quantity"));
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.google.checkout.schema._2.Item.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000!com.sun.msv.grammar.InterleaveExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom."
+"sun.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/g"
+"rammar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expres"
+"sion\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L"
+"\u0000\u000bexpandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\'co"
+"m.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClass"
+"t\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.El"
+"ementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentMo"
+"delq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000"
+"\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom"
+"/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000#com.sun.msv.datatype.xs"
+"d.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv.datat"
+"ype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype"
+".xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSD"
+"atatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/String;L\u0000"
+"\btypeNameq\u0000~\u0000\u0018L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/Whit"
+"eSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006stri"
+"ngsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.Expression$NullSetExpres"
+"sion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f"
+"\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0018L\u0000\fnamespaceURIq\u0000~\u0000\u0018xpq\u0000~\u0000\u001cq\u0000~\u0000\u001bsr\u0000\u001dco"
+"m.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000 com.sun.ms"
+"v.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000"
+"\u000bxq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0010pps"
+"r\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0015q\u0000~\u0000\u001bt"
+"\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Coll"
+"apse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001eq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000-q\u0000~\u0000\u001bsr\u0000#com.sun.msv.gr"
+"ammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0018L\u0000\fnamespac"
+"eURIq\u0000~\u0000\u0018xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004ty"
+"pet\u0000)http://www.w3.org/2001/XMLSchema-instancesr\u00000com.sun.ms"
+"v.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000"
+"(\u0001q\u0000~\u00007sq\u0000~\u00001t\u0000\u0010item-descriptiont\u0000#http://checkout.google.co"
+"m/schema/2sq\u0000~\u0000\npp\u0000sq\u0000~\u0000\u000eppq\u0000~\u0000\u0013sq\u0000~\u0000$ppsq\u0000~\u0000&q\u0000~\u0000)pq\u0000~\u0000*q\u0000~"
+"\u00003q\u0000~\u00007sq\u0000~\u00001t\u0000\titem-nameq\u0000~\u0000;sq\u0000~\u0000$ppsq\u0000~\u0000\nq\u0000~\u0000)p\u0000sq\u0000~\u0000\u000epps"
+"q\u0000~\u0000\npp\u0000sq\u0000~\u0000$ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000"
+"~\u0000\u0003q\u0000~\u0000)psq\u0000~\u0000&q\u0000~\u0000)psr\u00002com.sun.msv.grammar.Expression$AnyS"
+"tringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u00008q\u0000~\u0000Lsr\u0000 com.sun.msv.gr"
+"ammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00002q\u0000~\u00007sq\u0000~\u00001t\u0000%com.google."
+"checkout.schema._2.AnyTypet\u0000+http://java.sun.com/jaxb/xjc/du"
+"mmy-elementssq\u0000~\u0000$ppsq\u0000~\u0000&q\u0000~\u0000)pq\u0000~\u0000*q\u0000~\u00003q\u0000~\u00007sq\u0000~\u00001t\u0000\u001amerc"
+"hant-private-item-dataq\u0000~\u0000;q\u0000~\u00007sq\u0000~\u0000\npp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010ppsr\u0000"
+" com.sun.msv.datatype.xsd.IntType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com.sun.msv."
+"datatype.xsd.IntegerDerivedType\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0001L\u0000\nbaseFacetst\u0000)Lc"
+"om/sun/msv/datatype/xsd/XSDatatypeImpl;xq\u0000~\u0000\u0015q\u0000~\u0000\u001bt\u0000\u0003intq\u0000~\u0000"
+"/sr\u0000*com.sun.msv.datatype.xsd.MaxInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000#com.sun.msv.datatype.xsd.RangeFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\nlimitValu"
+"et\u0000\u0012Ljava/lang/Object;xr\u00009com.sun.msv.datatype.xsd.DataTypeW"
+"ithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.x"
+"sd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCh"
+"eckFlagL\u0000\bbaseTypeq\u0000~\u0000[L\u0000\fconcreteTypet\u0000\'Lcom/sun/msv/dataty"
+"pe/xsd/ConcreteType;L\u0000\tfacetNameq\u0000~\u0000\u0018xq\u0000~\u0000\u0017ppq\u0000~\u0000/\u0000\u0001sr\u0000*com."
+"sun.msv.datatype.xsd.MinInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000_ppq\u0000~"
+"\u0000/\u0000\u0000sr\u0000!com.sun.msv.datatype.xsd.LongType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000Zq\u0000"
+"~\u0000\u001bt\u0000\u0004longq\u0000~\u0000/sq\u0000~\u0000^ppq\u0000~\u0000/\u0000\u0001sq\u0000~\u0000eppq\u0000~\u0000/\u0000\u0000sr\u0000$com.sun.msv"
+".datatype.xsd.IntegerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000Zq\u0000~\u0000\u001bt\u0000\u0007integerq\u0000~"
+"\u0000/sr\u0000,com.sun.msv.datatype.xsd.FractionDigitsFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0001I\u0000\u0005scalexr\u0000;com.sun.msv.datatype.xsd.DataTypeWithLexicalCon"
+"straintFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xq\u0000~\u0000bppq\u0000~\u0000/\u0001\u0000sr\u0000#com.sun.msv.dataty"
+"pe.xsd.NumberType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0015q\u0000~\u0000\u001bt\u0000\u0007decimalq\u0000~\u0000/q\u0000~\u0000st"
+"\u0000\u000efractionDigits\u0000\u0000\u0000\u0000q\u0000~\u0000mt\u0000\fminInclusivesr\u0000\u000ejava.lang.Long;\u008b"
+"\u00e4\u0090\u00cc\u008f#\u00df\u0002\u0000\u0001J\u0000\u0005valuexr\u0000\u0010java.lang.Number\u0086\u00ac\u0095\u001d\u000b\u0094\u00e0\u008b\u0002\u0000\u0000xp\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0000"
+"~\u0000mt\u0000\fmaxInclusivesq\u0000~\u0000w\u007f\u00ff\u00ff\u00ff\u00ff\u00ff\u00ff\u00ffq\u0000~\u0000hq\u0000~\u0000vsr\u0000\u0011java.lang.Inte"
+"ger\u0012\u00e2\u00a0\u00a4\u00f7\u0081\u00878\u0002\u0000\u0001I\u0000\u0005valuexq\u0000~\u0000x\u0080\u0000\u0000\u0000q\u0000~\u0000hq\u0000~\u0000zsq\u0000~\u0000|\u007f\u00ff\u00ff\u00ffq\u0000~\u0000!sq\u0000"
+"~\u0000\"q\u0000~\u0000]q\u0000~\u0000\u001bsq\u0000~\u0000$ppsq\u0000~\u0000&q\u0000~\u0000)pq\u0000~\u0000*q\u0000~\u00003q\u0000~\u00007sq\u0000~\u00001t\u0000\bqua"
+"ntityq\u0000~\u0000;sq\u0000~\u0000$ppsq\u0000~\u0000\nq\u0000~\u0000)p\u0000sq\u0000~\u0000\u000eppq\u0000~\u0000\u0013sq\u0000~\u0000$ppsq\u0000~\u0000&q\u0000"
+"~\u0000)pq\u0000~\u0000*q\u0000~\u00003q\u0000~\u00007sq\u0000~\u00001t\u0000\u0012tax-table-selectorq\u0000~\u0000;q\u0000~\u00007sq\u0000~"
+"\u0000\npp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\npp\u0000sq\u0000~\u0000$ppsq\u0000~\u0000Gq\u0000~\u0000)psq\u0000~\u0000&q\u0000~\u0000)pq\u0000~\u0000Lq"
+"\u0000~\u0000Nq\u0000~\u00007sq\u0000~\u00001t\u0000#com.google.checkout.schema._2.Moneyq\u0000~\u0000Qsq"
+"\u0000~\u0000$ppsq\u0000~\u0000&q\u0000~\u0000)pq\u0000~\u0000*q\u0000~\u00003q\u0000~\u00007sq\u0000~\u00001t\u0000\nunit-priceq\u0000~\u0000;sr\u0000"
+"\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/"
+"Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun"
+".msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\r"
+"streamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool"
+";xp\u0000\u0000\u0000\u0017\u0001pq\u0000~\u0000Dq\u0000~\u0000\u008cq\u0000~\u0000\u000fq\u0000~\u0000=q\u0000~\u0000\u0086q\u0000~\u0000\u0005q\u0000~\u0000\u0084q\u0000~\u0000%q\u0000~\u0000>q\u0000~\u0000Rq"
+"\u0000~\u0000\u0080q\u0000~\u0000\u0087q\u0000~\u0000\u0093q\u0000~\u0000\bq\u0000~\u0000Iq\u0000~\u0000\u008fq\u0000~\u0000\u0007q\u0000~\u0000Fq\u0000~\u0000\tq\u0000~\u0000\u008eq\u0000~\u0000\u0006q\u0000~\u0000Wq"
+"\u0000~\u0000Bx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.google.checkout.schema._2.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.google.checkout.schema._2.impl.runtime.UnmarshallingContext context) {
            super(context, "-------------");
        }

        protected Unmarshaller(com.google.checkout.schema._2.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.google.checkout.schema._2.impl.ItemImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  11 :
                        attIdx = context.getAttribute("", "currency");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("unit-price" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 11;
                            return ;
                        }
                        if (("tax-table-selector" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 1;
                            return ;
                        }
                        if (("quantity" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 5;
                            return ;
                        }
                        if (("merchant-private-item-data" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 7;
                            return ;
                        }
                        if (("item-name" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 3;
                            return ;
                        }
                        if (("item-description" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 9;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  7 :
                        if (true) {
                            _MerchantPrivateItemData = ((com.google.checkout.schema._2.impl.AnyTypeImpl) spawnChildFromEnterElement((com.google.checkout.schema._2.impl.AnyTypeImpl.class), 8, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        if (("quantity" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.popAttributes();
                            state = 0;
                            return ;
                        }
                        break;
                    case  11 :
                        attIdx = context.getAttribute("", "currency");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  12 :
                        if (("unit-price" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.popAttributes();
                            state = 0;
                            return ;
                        }
                        break;
                    case  8 :
                        if (("merchant-private-item-data" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.popAttributes();
                            state = 0;
                            return ;
                        }
                        break;
                    case  10 :
                        if (("item-description" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.popAttributes();
                            state = 0;
                            return ;
                        }
                        break;
                    case  4 :
                        if (("item-name" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.popAttributes();
                            state = 0;
                            return ;
                        }
                        break;
                    case  2 :
                        if (("tax-table-selector" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.popAttributes();
                            state = 0;
                            return ;
                        }
                        break;
                    case  0 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  11 :
                        if (("currency" == ___local)&&("" == ___uri)) {
                            _UnitPrice = ((com.google.checkout.schema._2.impl.MoneyImpl) spawnChildFromEnterAttribute((com.google.checkout.schema._2.impl.MoneyImpl.class), 12, ___uri, ___local, ___qname));
                            return ;
                        }
                        break;
                    case  0 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  11 :
                        attIdx = context.getAttribute("", "currency");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  0 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  11 :
                            attIdx = context.getAttribute("", "currency");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  1 :
                            state = 2;
                            eatText1(value);
                            return ;
                        case  3 :
                            state = 4;
                            eatText2(value);
                            return ;
                        case  5 :
                            state = 6;
                            eatText3(value);
                            return ;
                        case  0 :
                            revertToParentFromText(value);
                            return ;
                        case  9 :
                            state = 10;
                            eatText4(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _TaxTableSelector = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _ItemName = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Quantity = javax.xml.bind.DatatypeConverter.parseInt(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_Quantity = true;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText4(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _ItemDescription = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
