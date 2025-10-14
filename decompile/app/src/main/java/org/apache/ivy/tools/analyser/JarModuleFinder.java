package org.apache.ivy.tools.analyser;

import java.io.File;
import java.util.ArrayList;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.resolver.util.FileURLLister;
import org.apache.ivy.plugins.resolver.util.ResolverHelper;
import org.apache.ivy.util.Message;

/* loaded from: classes8.dex */
public class JarModuleFinder {
    public String filePattern;
    public String pattern;

    public JarModuleFinder(String str) {
        this.pattern = "file:///" + str;
        this.filePattern = str;
    }

    public JarModule[] findJarModules() {
        JarModuleFinder jarModuleFinder = this;
        String str = "module";
        String str2 = IvyPatternHelper.ORGANISATION_KEY;
        ArrayList arrayList = new ArrayList();
        FileURLLister fileURLLister = new FileURLLister();
        try {
            String[] strArrListTokenValues = ResolverHelper.listTokenValues(fileURLLister, jarModuleFinder.pattern, IvyPatternHelper.ORGANISATION_KEY);
            int length = strArrListTokenValues.length;
            int i = 0;
            while (i < length) {
                String str3 = strArrListTokenValues[i];
                String strSubstituteToken = IvyPatternHelper.substituteToken(jarModuleFinder.pattern, str2, str3);
                String[] strArrListTokenValues2 = ResolverHelper.listTokenValues(fileURLLister, strSubstituteToken, str);
                int length2 = strArrListTokenValues2.length;
                int i2 = 0;
                while (i2 < length2) {
                    String str4 = strArrListTokenValues2[i2];
                    String[] strArrListTokenValues3 = ResolverHelper.listTokenValues(fileURLLister, IvyPatternHelper.substituteToken(strSubstituteToken, str, str4), IvyPatternHelper.REVISION_KEY);
                    int length3 = strArrListTokenValues3.length;
                    String str5 = str;
                    int i3 = 0;
                    while (i3 < length3) {
                        String str6 = str2;
                        String str7 = strArrListTokenValues3[i3];
                        FileURLLister fileURLLister2 = fileURLLister;
                        String[] strArr = strArrListTokenValues;
                        int i4 = length3;
                        String str8 = str4;
                        int i5 = i2;
                        int i6 = length2;
                        String[] strArr2 = strArrListTokenValues2;
                        String str9 = strSubstituteToken;
                        String str10 = str3;
                        File file = new File(IvyPatternHelper.substitute(jarModuleFinder.filePattern, str3, str8, str7, str8, "jar", "jar"));
                        if (file.exists()) {
                            arrayList.add(new JarModule(ModuleRevisionId.newInstance(str10, str8, str7), file));
                        }
                        i3++;
                        str3 = str10;
                        str4 = str8;
                        str2 = str6;
                        fileURLLister = fileURLLister2;
                        strArrListTokenValues = strArr;
                        length3 = i4;
                        i2 = i5;
                        length2 = i6;
                        strArrListTokenValues2 = strArr2;
                        strSubstituteToken = str9;
                        jarModuleFinder = this;
                    }
                    i2++;
                    str = str5;
                    jarModuleFinder = this;
                }
                i++;
                jarModuleFinder = this;
            }
        } catch (Exception e) {
            Message.debug(e);
        }
        return (JarModule[]) arrayList.toArray(new JarModule[arrayList.size()]);
    }

    public static void main(String[] strArr) {
        for (JarModule jarModule : new JarModuleFinder("D:/temp/test2/ivyrep/[organisation]/[module]/[revision]/[artifact].[ext]").findJarModules()) {
            System.out.println(jarModule);
        }
    }
}
