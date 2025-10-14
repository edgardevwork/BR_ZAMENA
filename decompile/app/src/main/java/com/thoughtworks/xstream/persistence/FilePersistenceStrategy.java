package com.thoughtworks.xstream.persistence;

import androidx.appcompat.widget.ActivityChooserModel;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.p042io.xml.DomDriver;
import java.io.File;
import org.apache.commons.lang3.ObjectUtils;

/* loaded from: classes8.dex */
public class FilePersistenceStrategy extends AbstractFilePersistenceStrategy {
    public final String illegalChars;

    public FilePersistenceStrategy(File file) {
        this(file, new XStream(new DomDriver()));
    }

    public FilePersistenceStrategy(File file, XStream xStream) {
        this(file, xStream, "utf-8", "<>?:/\\\"|*%");
    }

    public FilePersistenceStrategy(File file, XStream xStream, String str, String str2) {
        super(file, xStream, str);
        this.illegalChars = str2;
    }

    @Override // com.thoughtworks.xstream.persistence.AbstractFilePersistenceStrategy
    public boolean isValid(File file, String str) {
        return super.isValid(file, str) && str.indexOf(64) > 0;
    }

    @Override // com.thoughtworks.xstream.persistence.AbstractFilePersistenceStrategy
    public Object extractKey(String str) {
        String strUnescape = unescape(str.substring(0, str.length() - 4));
        if ("null@null".equals(strUnescape)) {
            return null;
        }
        int iIndexOf = strUnescape.indexOf(64);
        if (iIndexOf < 0) {
            ConversionException conversionException = new ConversionException("No valid key");
            conversionException.add("key", strUnescape);
            throw conversionException;
        }
        Class clsRealClass = getMapper().realClass(strUnescape.substring(0, iIndexOf));
        Converter converterLookupConverterForType = getConverterLookup().lookupConverterForType(clsRealClass);
        if (converterLookupConverterForType instanceof SingleValueConverter) {
            return ((SingleValueConverter) converterLookupConverterForType).fromString(strUnescape.substring(iIndexOf + 1));
        }
        ConversionException conversionException2 = new ConversionException("No SingleValueConverter available for key type");
        conversionException2.add("key-type", clsRealClass.getName());
        throw conversionException2;
    }

    public String unescape(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int iIndexOf = str.indexOf(37);
            if (iIndexOf >= 0) {
                stringBuffer.append(str.substring(0, iIndexOf));
                int i = iIndexOf + 1;
                int i2 = iIndexOf + 3;
                stringBuffer.append((char) Integer.parseInt(str.substring(i, i2), 16));
                str = str.substring(i2);
            } else {
                stringBuffer.append(str);
                return stringBuffer.toString();
            }
        }
    }

    @Override // com.thoughtworks.xstream.persistence.AbstractFilePersistenceStrategy
    public String getName(Object obj) {
        if (obj == null) {
            return "null@null.xml";
        }
        Class<?> cls = obj.getClass();
        Converter converterLookupConverterForType = getConverterLookup().lookupConverterForType(cls);
        if (converterLookupConverterForType instanceof SingleValueConverter) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getMapper().serializedClass(cls));
            stringBuffer.append(ObjectUtils.AT_SIGN);
            stringBuffer.append(escape(((SingleValueConverter) converterLookupConverterForType).toString(obj)));
            stringBuffer.append(ActivityChooserModel.HISTORY_FILE_EXTENSION);
            return stringBuffer.toString();
        }
        ConversionException conversionException = new ConversionException("No SingleValueConverter available for key type");
        conversionException.add("key-type", cls.getName());
        throw conversionException;
    }

    public String escape(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (char c : str.toCharArray()) {
            if (c >= ' ' && this.illegalChars.indexOf(c) < 0) {
                stringBuffer.append(c);
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("%");
                stringBuffer2.append(Integer.toHexString(c).toUpperCase());
                stringBuffer.append(stringBuffer2.toString());
            }
        }
        return stringBuffer.toString();
    }
}
