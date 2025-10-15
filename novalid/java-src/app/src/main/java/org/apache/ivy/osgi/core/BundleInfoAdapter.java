package org.apache.ivy.osgi.core;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.Manifest;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.descriptor.DefaultDependencyDescriptor;
import org.apache.ivy.core.module.descriptor.DefaultExcludeRule;
import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.descriptor.ExtraInfoHolder;
import org.apache.ivy.core.module.p062id.ArtifactId;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.osgi.util.Version;
import org.apache.ivy.osgi.util.VersionRange;
import org.apache.ivy.plugins.matcher.ExactOrRegexpPatternMatcher;
import org.apache.ivy.plugins.parser.ModuleDescriptorParser;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;

/* loaded from: classes5.dex */
public class BundleInfoAdapter {
    public static final Configuration CONF_DEFAULT = new Configuration("default");
    public static final String CONF_NAME_DEFAULT = "default";
    public static final String CONF_NAME_OPTIONAL = "optional";
    public static final String CONF_NAME_TRANSITIVE_OPTIONAL = "transitive-optional";
    public static final Configuration CONF_OPTIONAL;
    public static final Configuration CONF_TRANSITIVE_OPTIONAL;
    public static final String CONF_USE_PREFIX = "use_";
    public static final String EXTRA_INFO_EXPORT_PREFIX = "_osgi_export_";

    static {
        Configuration.Visibility visibility = Configuration.Visibility.PUBLIC;
        CONF_OPTIONAL = new Configuration("optional", visibility, "Optional dependencies", new String[]{"default"}, true, null);
        CONF_TRANSITIVE_OPTIONAL = new Configuration(CONF_NAME_TRANSITIVE_OPTIONAL, visibility, "Optional dependencies", new String[]{"optional"}, true, null);
    }

    public static DefaultModuleDescriptor toModuleDescriptor(ModuleDescriptorParser moduleDescriptorParser, URI uri, BundleInfo bundleInfo, ExecutionEnvironmentProfileProvider executionEnvironmentProfileProvider) {
        return toModuleDescriptor(moduleDescriptorParser, uri, bundleInfo, null, executionEnvironmentProfileProvider);
    }

    public static DefaultModuleDescriptor toModuleDescriptor(ModuleDescriptorParser moduleDescriptorParser, URI uri, BundleInfo bundleInfo, Manifest manifest, ExecutionEnvironmentProfileProvider executionEnvironmentProfileProvider) throws ProfileNotFoundException {
        String str;
        String str2;
        DefaultModuleDescriptor defaultModuleDescriptor = new DefaultModuleDescriptor(moduleDescriptorParser, null);
        defaultModuleDescriptor.addExtraAttributeNamespace("o", Ivy.getIvyHomeURL() + "osgi");
        ModuleRevisionId moduleRevisionIdAsMrid = asMrid(BundleInfo.BUNDLE_TYPE, bundleInfo.getSymbolicName(), bundleInfo.getVersion());
        defaultModuleDescriptor.setResolvedPublicationDate(new Date());
        defaultModuleDescriptor.setModuleRevisionId(moduleRevisionIdAsMrid);
        defaultModuleDescriptor.addConfiguration(CONF_DEFAULT);
        defaultModuleDescriptor.addConfiguration(CONF_OPTIONAL);
        defaultModuleDescriptor.addConfiguration(CONF_TRANSITIVE_OPTIONAL);
        HashSet hashSet = new HashSet(bundleInfo.getExports().size());
        Iterator<ExportPackage> it = bundleInfo.getExports().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            ExportPackage next = it.next();
            defaultModuleDescriptor.getExtraInfos().add(new ExtraInfoHolder(EXTRA_INFO_EXPORT_PREFIX + next.getName(), next.getVersion().toString()));
            hashSet.add(next.getName());
            String[] strArr = new String[next.getUses().size() + 1];
            Iterator<String> it2 = next.getUses().iterator();
            while (it2.hasNext()) {
                strArr[i] = CONF_USE_PREFIX + it2.next();
                i++;
            }
            strArr[i] = "default";
            defaultModuleDescriptor.addConfiguration(new Configuration(CONF_USE_PREFIX + next.getName(), Configuration.Visibility.PUBLIC, "Exported package " + next.getName(), strArr, true, null));
        }
        requirementAsDependency(defaultModuleDescriptor, bundleInfo, hashSet);
        if (uri != null) {
            for (BundleArtifact bundleArtifact : bundleInfo.getArtifacts()) {
                String str3 = (!bundleInfo.hasInnerClasspath() || bundleArtifact.isSource()) ? null : BundleInfo.BUNDLE_TYPE;
                if ("packed".equals(bundleArtifact.getFormat())) {
                    str = str3 != null ? str3 + ",pack200" : "pack200";
                    str2 = "jar.pack.gz";
                } else {
                    str = str3;
                    str2 = "jar";
                }
                String str4 = bundleArtifact.isSource() ? "source" : "jar";
                URI uri2 = bundleArtifact.getUri();
                if (uri2 != null) {
                    defaultModuleDescriptor.addArtifact("default", buildArtifact(moduleRevisionIdAsMrid, uri, uri2, str4, str2, str));
                }
            }
        }
        if (executionEnvironmentProfileProvider != null) {
            for (String str5 : bundleInfo.getExecutionEnvironments()) {
                ExecutionEnvironmentProfile profile = executionEnvironmentProfileProvider.getProfile(str5);
                if (profile == null) {
                    throw new ProfileNotFoundException("Execution environment profile " + str5 + " not found");
                }
                Iterator<String> it3 = profile.getPkgNames().iterator();
                while (it3.hasNext()) {
                    DefaultExcludeRule defaultExcludeRule = new DefaultExcludeRule(new ArtifactId(ModuleId.newInstance(BundleInfo.PACKAGE_TYPE, it3.next()), "*", "*", "*"), ExactOrRegexpPatternMatcher.INSTANCE, null);
                    for (String str6 : defaultModuleDescriptor.getConfigurationsNames()) {
                        defaultExcludeRule.addConfiguration(str6);
                    }
                    defaultModuleDescriptor.addExcludeRule(defaultExcludeRule);
                }
            }
        }
        if (manifest != null) {
            for (Map.Entry<Object, Object> entry : manifest.getMainAttributes().entrySet()) {
                defaultModuleDescriptor.addExtraInfo(new ExtraInfoHolder(entry.getKey().toString(), entry.getValue().toString()));
            }
        }
        return defaultModuleDescriptor;
    }

    public static DefaultArtifact buildArtifact(ModuleRevisionId moduleRevisionId, URI uri, URI uri2, String str, String str2, String str3) {
        if (ClientConfigurationFields.IVY.equals(uri2.getScheme())) {
            return decodeIvyURI(uri2);
        }
        if (!uri2.isAbsolute()) {
            uri2 = uri.resolve(uri2);
        }
        HashMap map = new HashMap();
        if (str3 != null) {
            map.put(PomReader.PACKAGING, str3);
        }
        try {
            return new DefaultArtifact(moduleRevisionId, null, moduleRevisionId.getName(), str, str2, new URL(uri2.toString()), map);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Unable to make the uri into the url", e);
        }
    }

    public static List<String> getConfigurations(BundleInfo bundleInfo) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("default");
        arrayList.add("optional");
        arrayList.add(CONF_NAME_TRANSITIVE_OPTIONAL);
        Iterator<ExportPackage> it = bundleInfo.getExports().iterator();
        while (it.hasNext()) {
            arrayList.add(CONF_USE_PREFIX + it.next().getName());
        }
        return arrayList;
    }

    public static URI buildIvyURI(Artifact artifact) {
        ModuleRevisionId moduleRevisionId = artifact.getModuleRevisionId();
        return asIvyURI(moduleRevisionId.getOrganisation(), moduleRevisionId.getName(), moduleRevisionId.getBranch(), moduleRevisionId.getRevision(), artifact.getType(), artifact.getName(), artifact.getExt());
    }

    public static URI asIvyURI(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        StringBuilder sb = new StringBuilder();
        sb.append("ivy:///");
        sb.append(str);
        sb.append('/');
        sb.append(str2);
        sb.append('?');
        if (str3 != null) {
            sb.append("branch=");
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append("&rev=");
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append("&type=");
            sb.append(str5);
        }
        if (str6 != null) {
            sb.append("&art=");
            sb.append(str6);
        }
        if (str7 != null) {
            sb.append("&ext=");
            sb.append(str7);
        }
        try {
            return new URI(sb.toString());
        } catch (URISyntaxException e) {
            throw new RuntimeException("ill-formed ivy url", e);
        }
    }

    public static DefaultArtifact decodeIvyURI(URI uri) {
        String path = uri.getPath();
        if (!path.startsWith("/")) {
            throw new IllegalArgumentException("An ivy url should be of the form ivy:///org/module but was : " + uri);
        }
        int iIndexOf = path.indexOf(47, 1);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Expecting an organisation in the ivy url: " + uri);
        }
        String strSubstring = path.substring(1, iIndexOf);
        String strSubstring2 = path.substring(iIndexOf + 1);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        for (String str6 : uri.getQuery().split("&")) {
            if (str6.length() != 0) {
                String[] strArrSplit = str6.split(URLEncodedUtils.NAME_VALUE_SEPARATOR);
                if (strArrSplit.length != 2) {
                    throw new IllegalArgumentException("Malformed query string in the ivy url: " + uri);
                }
                if (strArrSplit[0].equals(IvyPatternHelper.BRANCH_KEY)) {
                    str = strArrSplit[1];
                } else if (strArrSplit[0].equals("rev")) {
                    str2 = strArrSplit[1];
                } else if (strArrSplit[0].equals("art")) {
                    str3 = strArrSplit[1];
                } else if (strArrSplit[0].equals("type")) {
                    str4 = strArrSplit[1];
                } else if (strArrSplit[0].equals(IvyPatternHelper.EXT_KEY)) {
                    str5 = strArrSplit[1];
                } else {
                    throw new IllegalArgumentException("Unrecognized parameter '" + strArrSplit[0] + " in the query string of the ivy url: " + uri);
                }
            }
        }
        return new DefaultArtifact(ModuleRevisionId.newInstance(strSubstring, strSubstring2, str, str2), null, str3, str4, str5);
    }

    public static void requirementAsDependency(DefaultModuleDescriptor defaultModuleDescriptor, BundleInfo bundleInfo, Set<String> set) {
        String str;
        for (BundleRequirement bundleRequirement : bundleInfo.getRequirements()) {
            String type = bundleRequirement.getType();
            String name = bundleRequirement.getName();
            if (!BundleInfo.PACKAGE_TYPE.equals(type) || !set.contains(name)) {
                if (!"ee".equals(type)) {
                    DefaultDependencyDescriptor defaultDependencyDescriptor = new DefaultDependencyDescriptor(asMrid(type, name, bundleRequirement.getVersion()), false);
                    if (BundleInfo.PACKAGE_TYPE.equals(type)) {
                        str = CONF_USE_PREFIX + name;
                        defaultModuleDescriptor.addConfiguration(new Configuration(CONF_USE_PREFIX + name, Configuration.Visibility.PUBLIC, "Exported package " + name, new String[]{"default"}, true, null));
                        defaultDependencyDescriptor.addDependencyConfiguration(str, str);
                    } else {
                        str = "default";
                    }
                    if ("optional".equals(bundleRequirement.getResolution())) {
                        defaultDependencyDescriptor.addDependencyConfiguration("optional", str);
                        defaultDependencyDescriptor.addDependencyConfiguration(CONF_NAME_TRANSITIVE_OPTIONAL, CONF_NAME_TRANSITIVE_OPTIONAL);
                    } else {
                        defaultDependencyDescriptor.addDependencyConfiguration("default", str);
                    }
                    defaultModuleDescriptor.addDependency(defaultDependencyDescriptor);
                }
            }
        }
    }

    public static ModuleRevisionId asMrid(String str, String str2, Version version) {
        return ModuleRevisionId.newInstance(str, str2, version == null ? null : version.toString());
    }

    public static ModuleRevisionId asMrid(String str, String str2, VersionRange versionRange) {
        String ivyRevision;
        if (versionRange == null) {
            ivyRevision = "[0,)";
        } else {
            ivyRevision = versionRange.toIvyRevision();
        }
        return ModuleRevisionId.newInstance(str, str2, ivyRevision);
    }

    public static class ProfileNotFoundException extends RuntimeException {
        public ProfileNotFoundException(String str) {
            super(str);
        }
    }
}
