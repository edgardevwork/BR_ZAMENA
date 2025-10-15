package org.apache.ivy.core;

import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.cache.RepositoryCacheManager;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.settings.IvyVariableContainer;
import org.apache.ivy.core.settings.IvyVariableContainerImpl;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;

/* loaded from: classes7.dex */
public final class IvyPatternHelper {
    public static final String ARTIFACT_KEY = "artifact";
    public static final String BRANCH_KEY = "branch";
    public static final String CONF_KEY = "conf";
    public static final String EXT_KEY = "ext";
    public static final String MODULE_KEY = "module";
    public static final String ORGANISATION_KEY = "organisation";
    public static final String ORGANISATION_KEY2 = "organization";
    public static final String ORGANISATION_PATH_KEY = "orgPath";
    public static final String ORIGINAL_ARTIFACTNAME_KEY = "originalname";
    public static final String REVISION_KEY = "revision";
    public static final String TYPE_KEY = "type";
    public static final Pattern PARAM_PATTERN = Pattern.compile("\\@\\{(.*?)\\}");
    public static final Pattern VAR_PATTERN = Pattern.compile("\\$\\{(.*?)\\}");

    public static String substitute(String str, ModuleRevisionId moduleRevisionId) {
        return substitute(str, moduleRevisionId.getOrganisation(), moduleRevisionId.getName(), moduleRevisionId.getBranch(), moduleRevisionId.getRevision(), ClientConfigurationFields.IVY, ClientConfigurationFields.IVY, "xml", null, null, moduleRevisionId.getQualifiedExtraAttributes(), null);
    }

    public static String substitute(String str, ModuleRevisionId moduleRevisionId, String str2, String str3, String str4) {
        return substitute(str, moduleRevisionId, new DefaultArtifact(moduleRevisionId, null, str2, str3, str4));
    }

    public static String substitute(String str, Artifact artifact) {
        return substitute(str, artifact, (String) null);
    }

    public static String substitute(String str, Artifact artifact, ArtifactOrigin artifactOrigin) {
        return substitute(str, artifact.getModuleRevisionId(), artifact, (String) null, artifactOrigin);
    }

    public static String substitute(String str, Artifact artifact, String str2) {
        return substitute(str, artifact.getModuleRevisionId(), artifact, str2, (ArtifactOrigin) null);
    }

    public static String substitute(String str, ModuleRevisionId moduleRevisionId, Artifact artifact) {
        return substitute(str, moduleRevisionId, artifact, (String) null, (ArtifactOrigin) null);
    }

    public static String substitute(String str, ModuleRevisionId moduleRevisionId, Artifact artifact, String str2, ArtifactOrigin artifactOrigin) {
        return substitute(str, moduleRevisionId.getOrganisation(), moduleRevisionId.getName(), moduleRevisionId.getBranch(), moduleRevisionId.getRevision(), artifact.getName(), artifact.getType(), artifact.getExt(), str2, artifactOrigin, moduleRevisionId.getQualifiedExtraAttributes(), artifact.getQualifiedExtraAttributes());
    }

    public static String substitute(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return substitute(str, str2, str3, null, str4, str5, str6, str7, null, null, null, null);
    }

    public static String substitute(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return substitute(str, str2, str3, null, str4, str5, str6, str7, str8, null, null, null);
    }

    public static String substitute(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, String> map, Map<String, String> map2) {
        return substitute(str, str2, str3, null, str4, str5, str6, str7, str8, null, map, map2);
    }

    public static String substitute(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ArtifactOrigin artifactOrigin, Map<String, String> map, Map<String, String> map2) {
        HashMap map3 = new HashMap();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key.indexOf(58) > 0) {
                    key = key.substring(key.indexOf(58) + 1);
                }
                map3.put(key, new Validated(key, entry.getValue()));
            }
        }
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                String key2 = entry2.getKey();
                if (key2.indexOf(58) > 0) {
                    key2 = key2.substring(key2.indexOf(58) + 1);
                }
                map3.put(key2, new Validated(key2, entry2.getValue()));
            }
        }
        map3.put(ORGANISATION_KEY, str2 == null ? "" : new Validated(ORGANISATION_KEY, str2));
        map3.put(ORGANISATION_KEY2, str2 == null ? "" : new Validated(ORGANISATION_KEY2, str2));
        map3.put(ORGANISATION_PATH_KEY, str2 == null ? "" : str2.replace('.', '/'));
        map3.put("module", str3 == null ? "" : new Validated("module", str3));
        map3.put(BRANCH_KEY, str4 == null ? "" : new Validated(BRANCH_KEY, str4));
        map3.put(REVISION_KEY, str5 != null ? new Validated(REVISION_KEY, str5) : "");
        map3.put("artifact", new Validated("artifact", str6 == null ? str3 : str6));
        Object validated = "jar";
        map3.put("type", str7 == null ? "jar" : new Validated("type", str7));
        if (str8 != null) {
            validated = new Validated(EXT_KEY, str8);
        }
        map3.put(EXT_KEY, validated);
        map3.put(CONF_KEY, str9 == null ? "default" : new Validated(CONF_KEY, str9));
        if (artifactOrigin == null) {
            map3.put(ORIGINAL_ARTIFACTNAME_KEY, new OriginalArtifactNameValue(str2, str3, str4, str5, str6, str7, str8, map, map2));
        } else {
            map3.put(ORIGINAL_ARTIFACTNAME_KEY, new OriginalArtifactNameValue(artifactOrigin));
        }
        return substituteTokens(str, map3, false);
    }

    public static String substituteVariables(String str, Map<String, String> map) {
        return substituteVariables(str, new IvyVariableContainerImpl(map), new Stack());
    }

    public static String substituteVariables(String str, IvyVariableContainer ivyVariableContainer) {
        return substituteVariables(str, ivyVariableContainer, new Stack());
    }

    public static String substituteVariables(String str, IvyVariableContainer ivyVariableContainer, Stack<String> stack) {
        String strGroup;
        StringBuffer stringBuffer = null;
        if (str == null) {
            return null;
        }
        Matcher matcher = VAR_PATTERN.matcher(str);
        boolean z = false;
        while (matcher.find()) {
            if (!z) {
                stringBuffer = new StringBuffer();
                z = true;
            }
            String strGroup2 = matcher.group(1);
            String variable = ivyVariableContainer.getVariable(strGroup2);
            if (variable != null) {
                int iIndexOf = stack.indexOf(strGroup2);
                if (iIndexOf != -1) {
                    ArrayList arrayList = new ArrayList(stack.subList(iIndexOf, stack.size()));
                    arrayList.add(strGroup2);
                    throw new IllegalArgumentException("cyclic variable definition: cycle = " + arrayList);
                }
                stack.push(strGroup2);
                strGroup = substituteVariables(variable, ivyVariableContainer, stack);
                stack.pop();
            } else {
                strGroup = matcher.group();
            }
            matcher.appendReplacement(stringBuffer, strGroup.replaceAll("\\\\", "\\\\\\\\").replaceAll("\\$", "\\\\\\$"));
        }
        if (!z) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static String substituteTokens(String str, Map<String, String> map) {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        return substituteTokens(str, map2, true);
    }

    public static String substituteTokens(String str, Map<String, Object> map, boolean z) {
        Map<String, Object> map2 = z ? map : new HashMap<>(map);
        if (map2.containsKey(ORGANISATION_KEY) && !map2.containsKey(ORGANISATION_KEY2)) {
            map2.put(ORGANISATION_KEY2, map2.get(ORGANISATION_KEY));
        }
        if (map2.containsKey(ORGANISATION_KEY) && !map2.containsKey(ORGANISATION_PATH_KEY)) {
            String str2 = (String) map2.get(ORGANISATION_KEY);
            map2.put(ORGANISATION_PATH_KEY, str2 == null ? "" : str2.replace('.', '/'));
        }
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        boolean z3 = false;
        StringBuffer stringBuffer = null;
        boolean z4 = false;
        StringBuffer stringBuffer2 = null;
        boolean z5 = false;
        for (char c : str.toCharArray()) {
            int iIndexOf = str.indexOf(c);
            if (c == '(') {
                if (z3) {
                    throw new IllegalArgumentException("invalid start of optional part at position " + iIndexOf + " in pattern " + str);
                }
                stringBuffer2 = new StringBuffer();
                z3 = true;
                z4 = false;
                z5 = false;
            } else if (c == ')') {
                if (!z3 || z2) {
                    throw new IllegalArgumentException("invalid end of optional part at position " + iIndexOf + " in pattern " + str);
                }
                if (z4) {
                    sb.append(stringBuffer2.toString());
                } else if (!z5) {
                    sb.append('(');
                    sb.append(stringBuffer2.toString());
                    sb.append(')');
                }
                z3 = false;
            } else if (c == '[') {
                if (z2) {
                    throw new IllegalArgumentException("invalid start of token at position " + iIndexOf + " in pattern " + str);
                }
                stringBuffer = new StringBuffer();
                z2 = true;
            } else if (c == ']') {
                if (!z2) {
                    throw new IllegalArgumentException("invalid end of token at position " + iIndexOf + " in pattern " + str);
                }
                String string = stringBuffer.toString();
                Object obj = map2.get(string);
                String string2 = obj == null ? null : obj.toString();
                if (z3) {
                    z4 = !StringUtils.isNullOrEmpty(string2);
                    stringBuffer2.append(string2);
                } else {
                    if (string2 == null) {
                        string2 = "[" + string + "]";
                    }
                    sb.append(string2);
                }
                z5 = true;
                z2 = false;
            } else if (z2) {
                stringBuffer.append(c);
            } else if (z3) {
                stringBuffer2.append(c);
            } else {
                sb.append(c);
            }
        }
        if (z2) {
            throw new IllegalArgumentException("last token hasn't been closed in pattern " + str);
        }
        if (z3) {
            throw new IllegalArgumentException("optional part hasn't been closed in pattern " + str);
        }
        String string3 = sb.toString();
        checkAgainstPathTraversal(str, string3);
        return string3;
    }

    public static String substituteVariable(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer(str);
        substituteVariable(stringBuffer, str2, str3);
        return stringBuffer.toString();
    }

    public static void substituteVariable(StringBuffer stringBuffer, String str, String str2) {
        String str3 = "${" + str + WebvttCssParser.RULE_END;
        int length = str3.length();
        int iIndexOf = stringBuffer.indexOf(str3);
        while (iIndexOf != -1) {
            stringBuffer.replace(iIndexOf, iIndexOf + length, str2);
            iIndexOf = stringBuffer.indexOf(str3, iIndexOf);
        }
    }

    public static String substituteToken(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer(str);
        substituteToken(stringBuffer, str2, str3);
        return stringBuffer.toString();
    }

    public static void substituteToken(StringBuffer stringBuffer, String str, String str2) {
        String tokenString = getTokenString(str);
        int length = tokenString.length();
        int iIndexOf = stringBuffer.indexOf(tokenString);
        while (iIndexOf != -1) {
            stringBuffer.replace(iIndexOf, iIndexOf + length, str2);
            iIndexOf = stringBuffer.indexOf(tokenString, iIndexOf);
        }
    }

    public static String getTokenString(String str) {
        return "[" + str + "]";
    }

    public static String substituteParams(String str, Map<String, String> map) {
        return substituteParams(str, new IvyVariableContainerImpl(map), new Stack());
    }

    public static String substituteParams(String str, IvyVariableContainer ivyVariableContainer, Stack<String> stack) {
        String strGroup;
        if (str == null) {
            return null;
        }
        Matcher matcher = PARAM_PATTERN.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup2 = matcher.group(1);
            String variable = ivyVariableContainer.getVariable(strGroup2);
            if (variable != null) {
                int iIndexOf = stack.indexOf(strGroup2);
                if (iIndexOf != -1) {
                    ArrayList arrayList = new ArrayList(stack.subList(iIndexOf, stack.size()));
                    arrayList.add(strGroup2);
                    throw new IllegalArgumentException("cyclic param definition: cycle = " + arrayList);
                }
                stack.push(strGroup2);
                strGroup = substituteVariables(variable, ivyVariableContainer, stack);
                stack.pop();
            } else {
                strGroup = matcher.group();
            }
            matcher.appendReplacement(stringBuffer, strGroup.replaceAll("\\\\", "\\\\\\\\").replaceAll("\\@", "\\\\\\@"));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static class OriginalArtifactNameValue {
        public String artifactExt;
        public String artifactName;
        public String artifactType;
        public String branch;
        public Map<String, String> extraArtifactAttributes;
        public Map<String, String> extraModuleAttributes;
        public String moduleName;

        /* renamed from: org */
        public String f11308org;
        public ArtifactOrigin origin;
        public String revision;

        public OriginalArtifactNameValue(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, String> map, Map<String, String> map2) {
            this.f11308org = str;
            this.moduleName = str2;
            this.branch = str3;
            this.revision = str4;
            this.artifactName = str5;
            this.artifactType = str6;
            this.artifactExt = str7;
            this.extraModuleAttributes = map;
            this.extraArtifactAttributes = map2;
        }

        public OriginalArtifactNameValue(ArtifactOrigin artifactOrigin) {
            this.origin = artifactOrigin;
        }

        public String toString() {
            if (this.origin == null) {
                ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(this.f11308org, this.moduleName, this.branch, this.revision, this.extraModuleAttributes);
                DefaultArtifact defaultArtifact = new DefaultArtifact(moduleRevisionIdNewInstance, (Date) null, this.artifactName, this.artifactType, this.artifactExt, this.extraArtifactAttributes);
                RepositoryCacheManager repositoryCacheManager = IvyContext.getContext().getSettings().getResolver(moduleRevisionIdNewInstance).getRepositoryCacheManager();
                ArtifactOrigin savedArtifactOrigin = repositoryCacheManager.getSavedArtifactOrigin(defaultArtifact);
                this.origin = savedArtifactOrigin;
                if (ArtifactOrigin.isUnknown(savedArtifactOrigin)) {
                    Message.debug("no artifact origin found for " + defaultArtifact + " in " + repositoryCacheManager);
                    return null;
                }
            }
            if (ArtifactOrigin.isUnknown(this.origin)) {
                return null;
            }
            String location = this.origin.getLocation();
            int iLastIndexOf = location.lastIndexOf(47);
            if (iLastIndexOf == -1) {
                iLastIndexOf = location.lastIndexOf(92);
            }
            return location.substring(iLastIndexOf + 1, location.lastIndexOf(46));
        }
    }

    public static String getTokenRoot(String str) {
        int iIndexOf = str.indexOf(91);
        if (iIndexOf == -1) {
            return str;
        }
        int iIndexOf2 = str.indexOf(40);
        if (iIndexOf2 >= 0) {
            iIndexOf = Math.min(iIndexOf, iIndexOf2);
        }
        return str.substring(0, iIndexOf);
    }

    public static String getFirstToken(String str) {
        int iIndexOf;
        int iIndexOf2;
        if (str == null || (iIndexOf = str.indexOf(91)) == -1 || (iIndexOf2 = str.indexOf(93, iIndexOf)) == -1) {
            return null;
        }
        return str.substring(iIndexOf + 1, iIndexOf2);
    }

    public static class Validated {
        public final String tokenName;
        public final String tokenValue;

        public /* synthetic */ Validated(String str, String str2, C111601 c111601) {
            this(str, str2);
        }

        public Validated(String str, String str2) {
            this.tokenName = str;
            this.tokenValue = str2;
        }

        public String toString() {
            String str = this.tokenValue;
            if (str != null && !str.isEmpty()) {
                StringTokenizer stringTokenizer = new StringTokenizer(this.tokenValue.replace("\\", "/"), "/");
                while (stringTokenizer.hasMoreTokens()) {
                    if ("..".equals(stringTokenizer.nextToken())) {
                        throw new IllegalArgumentException("'" + this.tokenName + "' value " + this.tokenValue + " contains an illegal path sequence");
                    }
                }
            }
            return this.tokenValue;
        }
    }

    public static void checkAgainstPathTraversal(String str, String str2) {
        String tokenRoot = getTokenRoot(str);
        int length = tokenRoot.length();
        if (tokenRoot.endsWith("/") || tokenRoot.endsWith("\\")) {
            length--;
        }
        String strReplace = str2.substring(length).replace("\\", "/");
        if (strReplace.endsWith("/..") || strReplace.indexOf("/../") >= 0) {
            throw new IllegalArgumentException("path after token expansion contains an illegal sequence");
        }
    }
}
