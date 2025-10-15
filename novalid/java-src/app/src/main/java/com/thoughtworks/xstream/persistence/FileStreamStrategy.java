package com.thoughtworks.xstream.persistence;

import androidx.appcompat.widget.ActivityChooserModel;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import kotlin.jvm.internal.CharCompanionObject;
import org.apache.ivy.plugins.parser.p064m2.PomModuleDescriptorBuilder;

/* loaded from: classes8.dex */
public class FileStreamStrategy extends AbstractFilePersistenceStrategy implements StreamStrategy {
    public FileStreamStrategy(File file) {
        this(file, new XStream());
    }

    public FileStreamStrategy(File file, XStream xStream) {
        super(file, xStream, null);
    }

    @Override // com.thoughtworks.xstream.persistence.AbstractFilePersistenceStrategy
    public Object extractKey(String str) {
        String strUnescape = unescape(str.substring(0, str.length() - 4));
        if (strUnescape.equals("\u0000")) {
            return null;
        }
        return strUnescape;
    }

    public String unescape(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] charArray = str.toCharArray();
        char c = CharCompanionObject.MAX_VALUE;
        int i = -1;
        int i2 = 0;
        while (i2 < charArray.length) {
            char c2 = charArray[i2];
            if (c2 == '_' && i != -1) {
                if (c == '_') {
                    stringBuffer.append(LauncherConstants.UNDERSCORE_CHAR);
                } else {
                    stringBuffer.append((char) i);
                }
                i = -1;
            } else if (c2 == '_') {
                i = 0;
            } else if (i != -1) {
                i = (i * 16) + Integer.parseInt(String.valueOf(c2), 16);
            } else {
                stringBuffer.append(c2);
            }
            i2++;
            c = c2;
        }
        return stringBuffer.toString();
    }

    @Override // com.thoughtworks.xstream.persistence.AbstractFilePersistenceStrategy
    public String getName(Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(escape(obj == null ? "\u0000" : obj.toString()));
        stringBuffer.append(ActivityChooserModel.HISTORY_FILE_EXTENSION);
        return stringBuffer.toString();
    }

    public String escape(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c) || ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))) {
                stringBuffer.append(c);
            } else if (c == '_') {
                stringBuffer.append(PomModuleDescriptorBuilder.EXTRA_INFO_DELIMITER);
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(LauncherConstants.UNDERSCORE_STRING);
                stringBuffer2.append(Integer.toHexString(c));
                stringBuffer2.append(LauncherConstants.UNDERSCORE_STRING);
                stringBuffer.append(stringBuffer2.toString());
            }
        }
        return stringBuffer.toString();
    }
}
