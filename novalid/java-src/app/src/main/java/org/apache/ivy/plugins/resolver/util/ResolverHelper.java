package org.apache.ivy.plugins.resolver.util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.repository.Repository;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.util.Message;

/* loaded from: classes6.dex */
public final class ResolverHelper {
    public static String[] listTokenValues(Repository repository, String str, String str2) {
        String strSubstring;
        String fileSeparator = repository.getFileSeparator();
        String strStandardize = repository.standardize(str);
        String tokenString = IvyPatternHelper.getTokenString(str2);
        int iIndexOf = strStandardize.indexOf(tokenString);
        if (iIndexOf == -1) {
            Message.verbose("unable to list " + str2 + " in " + strStandardize + ": token not found in pattern");
            return null;
        }
        if ((strStandardize.length() <= tokenString.length() + iIndexOf || fileSeparator.equals(strStandardize.substring(tokenString.length() + iIndexOf, tokenString.length() + iIndexOf + 1))) && (iIndexOf == 0 || fileSeparator.equals(strStandardize.substring(iIndexOf - 1, iIndexOf)))) {
            return listAll(repository, strStandardize.substring(0, iIndexOf));
        }
        int iLastIndexOf = strStandardize.substring(0, iIndexOf).lastIndexOf(fileSeparator);
        String strSubstring2 = iLastIndexOf == -1 ? "" : strStandardize.substring(0, iLastIndexOf);
        try {
            Message.debug("\tusing " + repository + " to list all in " + strSubstring2);
            String[] strArrListAll = listAll(repository, strSubstring2);
            if (strArrListAll == null) {
                return null;
            }
            Message.debug("\t\tfound " + strArrListAll.length + " urls");
            ArrayList arrayList = new ArrayList(strArrListAll.length);
            int i = iLastIndexOf + 1;
            int iIndexOf2 = strStandardize.indexOf(fileSeparator, i);
            if (iIndexOf2 != -1) {
                strSubstring = strStandardize.substring(i, iIndexOf2);
            } else {
                strSubstring = strStandardize.substring(i);
            }
            Pattern patternCompile = Pattern.compile(IvyPatternHelper.substituteToken(strSubstring.replaceAll("\\.", "\\\\."), str2, "(.+)"));
            for (String str3 : strArrListAll) {
                Matcher matcher = patternCompile.matcher(str3);
                if (matcher.matches()) {
                    arrayList.add(matcher.group(1));
                }
            }
            Message.debug("\t\t" + arrayList.size() + " matched " + strStandardize);
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        } catch (Exception e) {
            Message.warn("problem while listing resources in " + strSubstring2 + " with " + repository, e);
            return null;
        }
    }

    public static String[] listAll(Repository repository, String str) {
        try {
            String fileSeparator = repository.getFileSeparator();
            Message.debug("\tusing " + repository + " to list all in " + str);
            List<String> list = repository.list(str);
            if (list == null) {
                Message.debug("\t\tno resources found");
                return null;
            }
            Message.debug("\t\tfound " + list.size() + " resources");
            ArrayList arrayList = new ArrayList(list.size());
            for (String strSubstring : list) {
                if (strSubstring.endsWith(fileSeparator)) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                }
                arrayList.add(strSubstring.substring(strSubstring.lastIndexOf(fileSeparator) + 1));
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        } catch (IOException e) {
            Message.verbose("problem while listing resources in " + str + " with " + repository, e);
            return null;
        } catch (Exception e2) {
            Message.warn("problem while listing resources in " + str + " with " + repository, e2);
            return null;
        }
    }

    public static ResolvedResource[] findAll(Repository repository, ModuleRevisionId moduleRevisionId, String str, Artifact artifact) {
        String strSubstitute = IvyPatternHelper.substitute(str, ModuleRevisionId.newInstance(moduleRevisionId, IvyPatternHelper.getTokenString(IvyPatternHelper.REVISION_KEY)), artifact);
        Message.debug("\tlisting all in " + strSubstitute);
        String[] strArrListTokenValues = listTokenValues(repository, strSubstitute, IvyPatternHelper.REVISION_KEY);
        if (strArrListTokenValues != null) {
            Message.debug("\tfound revs: " + Arrays.asList(strArrListTokenValues));
            ArrayList arrayList = new ArrayList(strArrListTokenValues.length);
            for (String str2 : strArrListTokenValues) {
                String strSubstituteToken = IvyPatternHelper.substituteToken(strSubstitute, IvyPatternHelper.REVISION_KEY, str2);
                try {
                    Resource resource = repository.getResource(strSubstituteToken);
                    if (resource != null) {
                        arrayList.add(new ResolvedResource(resource, str2));
                    }
                } catch (IOException e) {
                    Message.warn("impossible to get resource from name listed by repository: " + strSubstituteToken, e);
                }
            }
            if (strArrListTokenValues.length != arrayList.size()) {
                Message.debug("\tfound resolved res: " + arrayList);
            }
            return (ResolvedResource[]) arrayList.toArray(new ResolvedResource[arrayList.size()]);
        }
        if (strSubstitute.contains("[revision]")) {
            return null;
        }
        try {
            Resource resource2 = repository.getResource(strSubstitute);
            if (resource2.exists()) {
                Message.debug("\tonly one resource found without real listing: using and defining it as working@" + repository.getName() + " revision: " + resource2.getName());
                return new ResolvedResource[]{new ResolvedResource(resource2, "working@" + repository.getName())};
            }
        } catch (IOException e2) {
            Message.debug("\timpossible to get resource from name listed by repository: " + strSubstitute, e2);
        }
        Message.debug("\tno revision found");
        return null;
    }

    public static String[] listTokenValues(URLLister uRLLister, String str, String str2) {
        String strSubstring;
        String strStandardize = standardize(str);
        if (uRLLister.accept(strStandardize)) {
            String tokenString = IvyPatternHelper.getTokenString(str2);
            int iIndexOf = strStandardize.indexOf(tokenString);
            if (iIndexOf == -1) {
                Message.verbose("unable to list " + str2 + " in " + strStandardize + ": token not found in pattern");
                return null;
            }
            if ((strStandardize.length() <= tokenString.length() + iIndexOf || "/".equals(strStandardize.substring(tokenString.length() + iIndexOf, tokenString.length() + iIndexOf + 1))) && (iIndexOf == 0 || "/".equals(strStandardize.substring(iIndexOf - 1, iIndexOf)))) {
                String strSubstring2 = strStandardize.substring(0, iIndexOf);
                try {
                    return listAll(uRLLister, new URL(strSubstring2));
                } catch (MalformedURLException e) {
                    Message.warn("malformed url from pattern root: " + strSubstring2 + ": " + e.getMessage());
                }
            } else {
                int iLastIndexOf = strStandardize.substring(0, iIndexOf).lastIndexOf(47);
                String strSubstring3 = iLastIndexOf == -1 ? "" : strStandardize.substring(0, iLastIndexOf);
                try {
                    Message.debug("\tusing " + uRLLister + " to list all in " + strSubstring3);
                    List<URL> listListAll = uRLLister.listAll(new URL(strSubstring3));
                    Message.debug("\t\tfound " + listListAll.size() + " urls");
                    ArrayList arrayList = new ArrayList(listListAll.size());
                    int i = iLastIndexOf + 1;
                    int iIndexOf2 = strStandardize.indexOf(47, i);
                    if (iIndexOf2 != -1) {
                        strSubstring = strStandardize.substring(i, iIndexOf2);
                    } else {
                        strSubstring = strStandardize.substring(i);
                    }
                    Pattern patternCompile = Pattern.compile(SegmentConstantPool.REGEX_MATCH_ALL + IvyPatternHelper.substituteToken(strSubstring, str2, "([^/]+)") + SegmentConstantPool.REGEX_MATCH_ALL);
                    Iterator<URL> it = listListAll.iterator();
                    while (it.hasNext()) {
                        Matcher matcher = patternCompile.matcher(standardize(it.next().getPath()));
                        if (matcher.matches()) {
                            arrayList.add(matcher.group(1));
                        }
                    }
                    Message.debug("\t\t" + arrayList.size() + " matched " + strStandardize);
                    return (String[]) arrayList.toArray(new String[arrayList.size()]);
                } catch (Exception e2) {
                    Message.warn("problem while listing files in " + strSubstring3, e2);
                    return null;
                }
            }
        }
        return null;
    }

    public static String standardize(String str) {
        return str.replace('\\', '/');
    }

    public static String[] listAll(URLLister uRLLister, URL url) {
        try {
            if (!uRLLister.accept(url.toExternalForm())) {
                return null;
            }
            Message.debug("\tusing " + uRLLister + " to list all in " + url);
            List<URL> listListAll = uRLLister.listAll(url);
            Message.debug("\t\tfound " + listListAll.size() + " urls");
            ArrayList arrayList = new ArrayList(listListAll.size());
            Iterator<URL> it = listListAll.iterator();
            while (it.hasNext()) {
                String path = it.next().getPath();
                if (path.endsWith("/")) {
                    path = path.substring(0, path.length() - 1);
                }
                arrayList.add(path.substring(path.lastIndexOf(47) + 1));
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        } catch (Exception e) {
            Message.warn("problem while listing directories in " + url, e);
            return null;
        }
    }
}
