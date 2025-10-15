package org.apache.ivy.ant;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.report.ResolveReport;
import org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorWriter;
import org.apache.tools.ant.BuildException;

/* loaded from: classes8.dex */
public class FixDepsTask extends IvyPostResolveTask {
    public File dest;
    public List<Keep> keeps = new ArrayList();

    public void setToFile(File file) {
        this.dest = file;
    }

    /* loaded from: classes7.dex */
    public static class Keep {
        public String module;

        /* renamed from: org, reason: collision with root package name */
        public String f11302org;

        public void setOrg(String str) {
            this.f11302org = str;
        }

        public void setModule(String str) {
            this.module = str;
        }
    }

    public Keep createKeep() {
        Keep keep = new Keep();
        this.keeps.add(keep);
        return keep;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        prepareAndCheck();
        File file = this.dest;
        if (file == null) {
            throw new BuildException("Missing required parameter 'tofile'");
        }
        if (file.exists() && this.dest.isDirectory()) {
            throw new BuildException("The destination file '" + this.dest.getAbsolutePath() + "' already exist and is a folder");
        }
        ResolveReport resolvedReport = getResolvedReport();
        ArrayList arrayList = new ArrayList();
        for (Keep keep : this.keeps) {
            arrayList.add(ModuleId.newInstance(keep.f11302org, keep.module));
        }
        try {
            XmlModuleDescriptorWriter.write(resolvedReport.toFixedModuleDescriptor(getSettings(), arrayList), this.dest);
        } catch (IOException e) {
            throw new BuildException("Failed to write into the file " + this.dest.getAbsolutePath() + " (" + e.getMessage() + ")", e);
        }
    }
}
