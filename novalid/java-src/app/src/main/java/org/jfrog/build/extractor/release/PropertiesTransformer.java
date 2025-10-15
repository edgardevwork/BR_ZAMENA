package org.jfrog.build.extractor.release;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.p059io.IOUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.jfrog.build.api.util.CommonUtils;
import org.jfrog.build.extractor.EolDetectingInputStream;

/* loaded from: classes7.dex */
public class PropertiesTransformer {
    public final File propertiesFile;
    public final Map<String, String> versionsByName;

    public PropertiesTransformer(File file, Map<String, String> map) {
        this.propertiesFile = file;
        this.versionsByName = map;
    }

    public Boolean transform() throws Throwable {
        if (!this.propertiesFile.exists()) {
            throw new IllegalArgumentException("Couldn't find properties file: " + this.propertiesFile.getAbsolutePath());
        }
        Properties properties = new Properties();
        EolDetectingInputStream eolDetectingInputStream = null;
        try {
            EolDetectingInputStream eolDetectingInputStream2 = new EolDetectingInputStream(new FileInputStream(this.propertiesFile));
            try {
                properties.load(eolDetectingInputStream2);
                IOUtils.closeQuietly((InputStream) eolDetectingInputStream2);
                String eol = eolDetectingInputStream2.getEol();
                boolean z = !"".equals(eol);
                StringBuilder sb = new StringBuilder();
                Enumeration<?> enumerationPropertyNames = properties.propertyNames();
                boolean z2 = false;
                while (enumerationPropertyNames.hasMoreElements()) {
                    String str = (String) enumerationPropertyNames.nextElement();
                    String property = properties.getProperty(str);
                    StringBuilder sb2 = new StringBuilder(str);
                    sb2.append(URLEncodedUtils.NAME_VALUE_SEPARATOR);
                    String str2 = this.versionsByName.get(str);
                    if (str2 != null && !str2.equals(property)) {
                        if (!z2) {
                            z2 = true;
                        }
                        sb2.append(str2);
                    } else {
                        sb2.append(property);
                    }
                    sb.append(sb2.toString());
                    if (z) {
                        sb.append(eol);
                    }
                }
                if (z2) {
                    this.propertiesFile.delete();
                    CommonUtils.writeByCharset(sb.toString(), this.propertiesFile, StandardCharsets.UTF_8);
                }
                return Boolean.valueOf(z2);
            } catch (Throwable th) {
                th = th;
                eolDetectingInputStream = eolDetectingInputStream2;
                IOUtils.closeQuietly((InputStream) eolDetectingInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
