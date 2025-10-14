package org.apache.ivy.ant;

import java.util.Date;
import java.util.Locale;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.report.ResolveReport;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.util.DateUtil;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.types.Reference;

/* loaded from: classes7.dex */
public abstract class IvyTask extends Task {
    public static final String ANT_PROJECT_CONTEXT_KEY = "ant-project";
    public Boolean validate = null;
    public Reference antIvyEngineRef = null;

    public abstract void doExecute() throws BuildException;

    public boolean doValidate(IvySettings ivySettings) {
        Boolean bool = this.validate;
        if (bool == null) {
            return ivySettings.doValidate();
        }
        return bool.booleanValue();
    }

    public boolean isValidate() {
        Boolean bool = this.validate;
        return bool == null || bool.booleanValue();
    }

    public void setValidate(boolean z) {
        this.validate = Boolean.valueOf(z);
    }

    public void setSettingsRef(Reference reference) {
        this.antIvyEngineRef = reference;
    }

    public Reference getSettingsRef() {
        return this.antIvyEngineRef;
    }

    public IvySettings getSettings() {
        return getIvyInstance().getSettings();
    }

    public Ivy getIvyInstance() throws BuildException {
        Object referencedObject;
        Reference reference = this.antIvyEngineRef;
        if (reference == null) {
            referencedObject = IvyAntSettings.getDefaultInstance(this);
        } else {
            referencedObject = reference.getReferencedObject(getProject());
            if (!referencedObject.getClass().getName().equals(IvyAntSettings.class.getName())) {
                throw new BuildException(this.antIvyEngineRef.getRefId() + " doesn't reference an ivy:settings", getLocation());
            }
            if (!(referencedObject instanceof IvyAntSettings)) {
                throw new BuildException(this.antIvyEngineRef.getRefId() + " has been defined in a different classloader.  Please use the same loader when defining your task, or redeclare your ivy:settings in this classloader", getLocation());
            }
        }
        Ivy configuredIvyInstance = ((IvyAntSettings) referencedObject).getConfiguredIvyInstance(this);
        AntMessageLogger.register(this, configuredIvyInstance);
        return configuredIvyInstance;
    }

    public void setResolved(ResolveReport resolveReport, boolean z) {
        ModuleDescriptor moduleDescriptor = resolveReport.getModuleDescriptor();
        String[] configurations = resolveReport.getConfigurations();
        if (z) {
            getProject().addReference("ivy.resolved.report", resolveReport);
            getProject().addReference("ivy.resolved.configurations.ref", configurations);
            getProject().addReference("ivy.resolved.descriptor", moduleDescriptor);
        }
        String str = moduleDescriptor.getModuleRevisionId().getModuleId().getOrganisation() + "." + moduleDescriptor.getModuleRevisionId().getModuleId().getName();
        getProject().addReference("ivy.resolved.report." + str, resolveReport);
        getProject().addReference("ivy.resolved.descriptor." + str, moduleDescriptor);
        getProject().addReference("ivy.resolved.configurations.ref." + str, configurations);
    }

    public void setResolved(ResolveReport resolveReport, String str, boolean z) {
        setResolved(resolveReport, z);
        if (str == null) {
            return;
        }
        ModuleDescriptor moduleDescriptor = resolveReport.getModuleDescriptor();
        String[] configurations = resolveReport.getConfigurations();
        getProject().addReference("ivy.resolved.report." + str, resolveReport);
        getProject().addReference("ivy.resolved.descriptor." + str, moduleDescriptor);
        getProject().addReference("ivy.resolved.configurations.ref." + str, configurations);
    }

    public String[] getResolvedConfigurations(String str, String str2, boolean z) {
        return (String[]) getReference("ivy.resolved.configurations.ref", str, str2, z);
    }

    public <T> T getResolvedDescriptor(String str) {
        return (T) getResolvedDescriptor(str, true);
    }

    public <T> T getResolvedDescriptor(String str, boolean z) throws BuildException {
        T t = (T) getProject().getReference("ivy.resolved.descriptor." + str);
        if (!z || t != null) {
            return t;
        }
        throw new BuildException("ModuleDescriptor for resolve with id '" + str + "' not found.");
    }

    public <T> T getResolvedDescriptor(String str, String str2) {
        return (T) getResolvedDescriptor(str, str2, false);
    }

    public <T> T getResolvedDescriptor(String str, String str2, boolean z) {
        return (T) getReference("ivy.resolved.descriptor", str, str2, z);
    }

    public final <T> T getReference(String str, String str2, String str3, boolean z) {
        T t;
        if (str2 == null || str3 == null) {
            t = null;
        } else {
            t = (T) getProject().getReference(str + "." + str2 + "." + str3);
        }
        return (z || t != null) ? t : (T) getProject().getReference(str);
    }

    public ResolveReport getResolvedReport(String str, String str2, String str3) {
        if (str3 == null) {
            return (ResolveReport) getReference("ivy.resolved.report", str, str2, false);
        }
        return (ResolveReport) getReference("ivy.resolved.report." + str3, null, null, false);
    }

    public String[] splitConfs(String str) {
        return StringUtils.splitToArray(str);
    }

    public String mergeConfs(String[] strArr) {
        return StringUtils.joinArray(strArr, ", ");
    }

    public static Date getPubDate(String str, Date date) throws BuildException {
        if (str == null) {
            return date;
        }
        if ("now".equals(str.toLowerCase(Locale.US))) {
            return new Date();
        }
        try {
            return DateUtil.parse(str);
        } catch (Exception unused) {
            throw new BuildException("Publication date provided in bad format. Should be 'yyyyMMddHHmmss' and not '" + str + "'!");
        }
    }

    public String getProperty(String str, IvySettings ivySettings, String str2) {
        if (str == null) {
            return getProperty(ivySettings, str2);
        }
        String strSubstitute = ivySettings.substitute(str);
        Message.debug("parameter found as attribute value: " + str2 + URLEncodedUtils.NAME_VALUE_SEPARATOR + strSubstitute);
        return strSubstitute;
    }

    public String getProperty(String str, IvySettings ivySettings, String str2, String str3) {
        if (str3 == null) {
            return getProperty(str, ivySettings, str2);
        }
        return getProperty(str, ivySettings, str2 + "." + str3);
    }

    public String getProperty(IvySettings ivySettings, String str, String str2) {
        if (str2 == null) {
            return getProperty(ivySettings, str);
        }
        return getProperty(ivySettings, str + "." + str2);
    }

    public String getProperty(IvySettings ivySettings, String str) {
        String variable = ivySettings.getVariable(str);
        if (variable == null) {
            String strSubstitute = ivySettings.substitute(getProject().getProperty(str));
            if (strSubstitute == null) {
                Message.debug("parameter not found: " + str);
                return strSubstitute;
            }
            Message.debug("parameter found as ant project property: " + str + URLEncodedUtils.NAME_VALUE_SEPARATOR + strSubstitute);
            return strSubstitute;
        }
        String strSubstitute2 = ivySettings.substitute(variable);
        Message.debug("parameter found as ivy variable: " + str + URLEncodedUtils.NAME_VALUE_SEPARATOR + strSubstitute2);
        return strSubstitute2;
    }

    public void prepareTask() {
        getProject().setProperty("ivy.version", Ivy.getIvyVersion());
        IvyContext.pushNewCopyContext();
        IvyContext.getContext().setIvy(getIvyInstance());
        IvyContext.getContext().push(ANT_PROJECT_CONTEXT_KEY, getProject());
    }

    public void finalizeTask() {
        if (!IvyContext.getContext().pop(ANT_PROJECT_CONTEXT_KEY, getProject())) {
            Message.error("ANT project popped from stack not equals current! Ignoring");
        }
        IvyContext.popContext();
    }

    public final void execute() throws BuildException {
        try {
            prepareTask();
            doExecute();
        } finally {
            finalizeTask();
        }
    }

    public String toString() {
        return getClass().getName() + io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER + getTaskName();
    }

    public void cacheAttributeNotSupported() {
        throw new BuildException("cache attribute is not supported any more. See IVY-685 for details.");
    }
}
