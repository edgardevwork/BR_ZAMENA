package com.thoughtworks.xstream.mapper;

import com.blackhub.bronline.launcher.LauncherConstants;
import org.apache.ivy.plugins.parser.p064m2.PomModuleDescriptorBuilder;

/* loaded from: classes8.dex */
public class AbstractXmlFriendlyMapper extends MapperWrapper {
    public char dollarReplacementInClass;
    public String dollarReplacementInField;
    public String noPackagePrefix;
    public String underscoreReplacementInField;

    public AbstractXmlFriendlyMapper(Mapper mapper) {
        super(mapper);
        this.dollarReplacementInClass = '-';
        this.dollarReplacementInField = "_DOLLAR_";
        this.underscoreReplacementInField = PomModuleDescriptorBuilder.EXTRA_INFO_DELIMITER;
        this.noPackagePrefix = "default";
    }

    public String escapeClassName(String str) {
        String strReplace = str.replace('$', this.dollarReplacementInClass);
        if (strReplace.charAt(0) != this.dollarReplacementInClass) {
            return strReplace;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.noPackagePrefix);
        stringBuffer.append(strReplace);
        return stringBuffer.toString();
    }

    public String unescapeClassName(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.noPackagePrefix);
        stringBuffer.append(this.dollarReplacementInClass);
        if (str.startsWith(stringBuffer.toString())) {
            str = str.substring(this.noPackagePrefix.length());
        }
        return str.replace(this.dollarReplacementInClass, '$');
    }

    public String escapeFieldName(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '$') {
                stringBuffer.append(this.dollarReplacementInField);
            } else if (cCharAt == '_') {
                stringBuffer.append(this.underscoreReplacementInField);
            } else {
                stringBuffer.append(cCharAt);
            }
        }
        return stringBuffer.toString();
    }

    public String unescapeFieldName(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        int length2 = 0;
        while (length2 < length) {
            char cCharAt = str.charAt(length2);
            if (stringFoundAt(str, length2, this.underscoreReplacementInField)) {
                length2 += this.underscoreReplacementInField.length() - 1;
                stringBuffer.append(LauncherConstants.UNDERSCORE_CHAR);
            } else if (stringFoundAt(str, length2, this.dollarReplacementInField)) {
                length2 += this.dollarReplacementInField.length() - 1;
                stringBuffer.append('$');
            } else {
                stringBuffer.append(cCharAt);
            }
            length2++;
        }
        return stringBuffer.toString();
    }

    public final boolean stringFoundAt(String str, int i, String str2) {
        return str.length() >= str2.length() + i && str.substring(i, str2.length() + i).equals(str2);
    }
}
