package org.apache.ivy.ant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.filters.LineContainsRegExp;
import org.apache.tools.ant.filters.TokenFilter;
import org.apache.tools.ant.taskdefs.Concat;
import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.FilterChain;
import org.apache.tools.ant.types.RegularExpression;

/* loaded from: classes7.dex */
public class IvyExtractFromSources extends Task {
    public String module;
    public String organisation;
    public String revision;
    public String status;

    /* renamed from: to */
    public File f9952to;
    public final List<String> ignoredPackaged = new ArrayList();
    public final Map<String, ModuleRevisionId> mapping = new HashMap();
    public Concat concat = new Concat();

    public static class Ignore {
        public String packageName;

        public String getPackage() {
            return this.packageName;
        }

        public void setPackage(String str) {
            this.packageName = str;
        }
    }

    public void addConfiguredIgnore(Ignore ignore) {
        this.ignoredPackaged.add(ignore.getPackage());
    }

    public File getTo() {
        return this.f9952to;
    }

    public void setTo(File file) {
        this.f9952to = file;
    }

    public String getModule() {
        return this.module;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public String getOrganisation() {
        return this.organisation;
    }

    public void setOrganisation(String str) {
        this.organisation = str;
    }

    public String getRevision() {
        return this.revision;
    }

    public void setRevision(String str) {
        this.revision = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void addConfiguredMapping(PackageMapping packageMapping) {
        this.mapping.put(packageMapping.getPackage(), packageMapping.getModuleRevisionId());
    }

    public void addFileSet(FileSet fileSet) {
        this.concat.addFileset(fileSet);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    public void execute() throws BuildException {
        configureConcat();
        StringWriter stringWriter = new StringWriter();
        this.concat.setWriter(stringWriter);
        this.concat.execute();
        HashSet<ModuleRevisionId> hashSet = new HashSet();
        for (String str : stringWriter.toString().split(StringUtils.f9903LF)) {
            ModuleRevisionId mapping = getMapping(str.trim());
            if (mapping != null) {
                hashSet.add(mapping);
            }
        }
        try {
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(this.f9952to));
            printWriter.println(String.format("<ivy-module version=\"1.0\">%n\t<info organisation=\"%s\"%n\t       module=\"%s\"", this.organisation, this.module));
            if (this.revision != null) {
                printWriter.println("\t       revision=\"" + this.revision + "\"");
            }
            String str2 = this.status;
            if (str2 == null) {
                str2 = "integration";
            }
            printWriter.println(String.format("\t       status=\"%s\"%n\t/>", str2));
            if (!hashSet.isEmpty()) {
                printWriter.println("\t<dependencies>");
                for (ModuleRevisionId moduleRevisionId : hashSet) {
                    printWriter.println(String.format("\t\t<dependency org=\"%s\" name=\"%s\" rev=\"%s\"/>", moduleRevisionId.getOrganisation(), moduleRevisionId.getName(), moduleRevisionId.getRevision()));
                }
                printWriter.println("\t</dependencies>");
            }
            printWriter.println("</ivy-module>");
            printWriter.close();
            log(hashSet.size() + " dependencies put in " + this.f9952to);
        } catch (FileNotFoundException e) {
            throw new BuildException("impossible to create file " + this.f9952to + ": " + e, e);
        }
    }

    public final ModuleRevisionId getMapping(String str) {
        String strSubstring = str;
        ModuleRevisionId moduleRevisionId = null;
        while (moduleRevisionId == null && !strSubstring.isEmpty()) {
            if (!this.ignoredPackaged.contains(strSubstring)) {
                moduleRevisionId = this.mapping.get(strSubstring);
                int iLastIndexOf = strSubstring.lastIndexOf(46);
                if (iLastIndexOf == -1) {
                    break;
                }
                strSubstring = strSubstring.substring(0, iLastIndexOf);
            } else {
                return null;
            }
        }
        if (moduleRevisionId == null) {
            log("no mapping found for " + str, 3);
        }
        return moduleRevisionId;
    }

    public final void configureConcat() {
        this.concat.setProject(getProject());
        this.concat.setTaskName(getTaskName());
        FilterChain filterChain = new FilterChain();
        LineContainsRegExp lineContainsRegExp = new LineContainsRegExp();
        RegularExpression regularExpression = new RegularExpression();
        regularExpression.setPattern("^import .+;");
        lineContainsRegExp.addConfiguredRegexp(regularExpression);
        filterChain.add(lineContainsRegExp);
        TokenFilter tokenFilter = new TokenFilter();
        TokenFilter.ReplaceRegex replaceRegex = new TokenFilter.ReplaceRegex();
        replaceRegex.setPattern("import (.+);.*");
        replaceRegex.setReplace("\\1");
        tokenFilter.add(replaceRegex);
        filterChain.add(tokenFilter);
        this.concat.addFilterChain(filterChain);
    }
}
