package org.apache.ivy.osgi.core;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.Iterator;
import java.util.jar.Attributes;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;
import org.apache.ivy.osgi.util.Version;
import org.apache.ivy.osgi.util.VersionRange;
import org.apache.ivy.util.StringUtils;

/* loaded from: classes5.dex */
public class ManifestParser {
    public static final String ATTR_BUNDLE_VERSION = "bundle-version";
    public static final String ATTR_RESOLUTION = "resolution";
    public static final String ATTR_USE = "use";
    public static final String ATTR_VERSION = "version";
    public static final String BUNDLE_CLASSPATH = "Bundle-ClassPath";
    public static final String BUNDLE_DESCRIPTION = "Bundle-Description";
    public static final String BUNDLE_MANIFEST_VERSION = "Bundle-ManifestVersion";
    public static final String BUNDLE_NAME = "Bundle-Name";
    public static final String BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT = "Bundle-RequiredExecutionEnvironment";
    public static final String BUNDLE_SYMBOLIC_NAME = "Bundle-SymbolicName";
    public static final String BUNDLE_VERSION = "Bundle-Version";
    public static final String ECLIPSE_SOURCE_BUNDLE = "Eclipse-SourceBundle";
    public static final String EXPORT_PACKAGE = "Export-Package";
    public static final String EXPORT_SERVICE = "Export-Service";
    public static final String IMPORT_PACKAGE = "Import-Package";
    public static final String IMPORT_SERVICE = "Import-Service";
    public static final String REQUIRE_BUNDLE = "Require-Bundle";

    public static BundleInfo parseJarManifest(InputStream inputStream) throws IOException, ParseException {
        JarInputStream jarInputStream = new JarInputStream(inputStream);
        Manifest manifest = jarInputStream.getManifest();
        jarInputStream.close();
        if (manifest == null) {
            return null;
        }
        return parseManifest(manifest);
    }

    public static BundleInfo parseManifest(File file) throws IOException, ParseException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            BundleInfo manifest = parseManifest(fileInputStream);
            fileInputStream.close();
            return manifest;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static BundleInfo parseManifest(String str) throws IOException, ParseException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
        BundleInfo manifest = parseManifest(byteArrayInputStream);
        byteArrayInputStream.close();
        return manifest;
    }

    public static BundleInfo parseManifest(InputStream inputStream) throws IOException, ParseException {
        return parseManifest(new Manifest(inputStream));
    }

    public static BundleInfo parseManifest(Manifest manifest) throws ParseException {
        Attributes mainAttributes = manifest.getMainAttributes();
        String singleValue = new ManifestHeaderValue(mainAttributes.getValue(BUNDLE_SYMBOLIC_NAME)).getSingleValue();
        if (singleValue == null) {
            throw new ParseException("No Bundle-SymbolicName in the manifest", 0);
        }
        String singleValue2 = new ManifestHeaderValue(mainAttributes.getValue(BUNDLE_DESCRIPTION)).getSingleValue();
        if (singleValue2 == null) {
            singleValue2 = new ManifestHeaderValue(mainAttributes.getValue(BUNDLE_DESCRIPTION)).getSingleValue();
        }
        String singleValue3 = new ManifestHeaderValue(mainAttributes.getValue(BUNDLE_VERSION)).getSingleValue();
        try {
            BundleInfo bundleInfo = new BundleInfo(singleValue, versionOf(singleValue3));
            bundleInfo.setDescription(singleValue2);
            bundleInfo.setExecutionEnvironments(new ManifestHeaderValue(mainAttributes.getValue(BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT)).getValues());
            parseRequirement(bundleInfo, mainAttributes, REQUIRE_BUNDLE, BundleInfo.BUNDLE_TYPE, ATTR_BUNDLE_VERSION);
            parseRequirement(bundleInfo, mainAttributes, IMPORT_PACKAGE, BundleInfo.PACKAGE_TYPE, "version");
            parseRequirement(bundleInfo, mainAttributes, IMPORT_SERVICE, "service", "version");
            for (ManifestHeaderElement manifestHeaderElement : new ManifestHeaderValue(mainAttributes.getValue(EXPORT_PACKAGE)).getElements()) {
                String str = manifestHeaderElement.getAttributes().get("version");
                try {
                    Version versionVersionOf = versionOf(str);
                    Iterator<String> it = manifestHeaderElement.getValues().iterator();
                    while (it.hasNext()) {
                        ExportPackage exportPackage = new ExportPackage(it.next(), versionVersionOf);
                        String str2 = manifestHeaderElement.getDirectives().get(ATTR_USE);
                        if (str2 != null) {
                            for (String str3 : StringUtils.splitToArray(str2)) {
                                exportPackage.addUse(str3);
                            }
                        }
                        bundleInfo.addCapability(exportPackage);
                    }
                } catch (NumberFormatException e) {
                    throw new ParseException("The Export-Package has an incorrect version: " + str + " (" + e.getMessage() + ")", 0);
                }
            }
            parseCapability(bundleInfo, mainAttributes, EXPORT_SERVICE, "service");
            String value = mainAttributes.getValue(ECLIPSE_SOURCE_BUNDLE);
            if (value != null) {
                bundleInfo.setSource(true);
                ManifestHeaderElement next = new ManifestHeaderValue(value).getElements().iterator().next();
                bundleInfo.setSymbolicNameTarget(next.getValues().iterator().next());
                String str4 = next.getAttributes().get("version");
                if (str4 != null) {
                    bundleInfo.setVersionTarget(new Version(str4));
                }
            }
            String value2 = mainAttributes.getValue(BUNDLE_CLASSPATH);
            if (value2 != null) {
                bundleInfo.setClasspath(new ManifestHeaderValue(value2).getValues());
                bundleInfo.setHasInnerClasspath(true);
            }
            return bundleInfo;
        } catch (NumberFormatException e2) {
            throw new ParseException("The Bundle-Version has an incorrect version: " + singleValue3 + " (" + e2.getMessage() + ")", 0);
        }
    }

    public static void parseRequirement(BundleInfo bundleInfo, Attributes attributes, String str, String str2, String str3) throws ParseException {
        for (ManifestHeaderElement manifestHeaderElement : new ManifestHeaderValue(attributes.getValue(str)).getElements()) {
            String str4 = manifestHeaderElement.getDirectives().get(ATTR_RESOLUTION);
            String str5 = manifestHeaderElement.getAttributes().get(str3);
            try {
                VersionRange versionRangeVersionRangeOf = versionRangeOf(str5);
                Iterator<String> it = manifestHeaderElement.getValues().iterator();
                while (it.hasNext()) {
                    bundleInfo.addRequirement(new BundleRequirement(str2, it.next(), versionRangeVersionRangeOf, str4));
                }
            } catch (ParseException e) {
                throw new ParseException("The " + str + " has an incorrect version: " + str5 + " (" + e.getMessage() + ")", 0);
            }
        }
    }

    public static void parseCapability(BundleInfo bundleInfo, Attributes attributes, String str, String str2) throws ParseException {
        for (ManifestHeaderElement manifestHeaderElement : new ManifestHeaderValue(attributes.getValue(str)).getElements()) {
            String str3 = manifestHeaderElement.getAttributes().get("version");
            try {
                Version versionVersionOf = versionOf(str3);
                Iterator<String> it = manifestHeaderElement.getValues().iterator();
                while (it.hasNext()) {
                    bundleInfo.addCapability(new BundleCapability(str2, it.next(), versionVersionOf));
                }
            } catch (NumberFormatException e) {
                throw new ParseException("The " + str + " has an incorrect version: " + str3 + " (" + e.getMessage() + ")", 0);
            }
        }
    }

    public static VersionRange versionRangeOf(String str) throws ParseException {
        if (str == null) {
            return null;
        }
        return new VersionRange(str);
    }

    public static Version versionOf(String str) {
        if (str == null) {
            return null;
        }
        return new Version(str);
    }

    public static String formatLines(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (String str2 : str.split(org.apache.commons.lang3.StringUtils.f9903LF)) {
            int i = 72;
            if (str2.length() <= 72) {
                sb.append(str2);
                sb.append('\n');
            } else {
                sb.append((CharSequence) str2, 0, 72);
                sb.append("\n ");
                while (i <= str2.length() - 1) {
                    int length = i + 71;
                    if (length > str2.length()) {
                        length = str2.length();
                    }
                    sb.append((CharSequence) str2, i, length);
                    sb.append('\n');
                    if (length != str2.length()) {
                        sb.append(' ');
                    }
                    i = length;
                }
            }
        }
        return sb.toString();
    }
}
