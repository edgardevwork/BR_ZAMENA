package org.apache.ivy.osgi.updatesite;

import java.net.URI;
import java.util.Iterator;
import org.apache.ivy.osgi.core.ExecutionEnvironmentProfileProvider;
import org.apache.ivy.osgi.repo.EditableRepoDescriptor;
import org.apache.ivy.osgi.updatesite.xml.EclipseFeature;
import org.apache.ivy.osgi.updatesite.xml.EclipsePlugin;

/* loaded from: classes8.dex */
public class UpdateSiteDescriptor extends EditableRepoDescriptor {
    public UpdateSiteDescriptor(URI uri, ExecutionEnvironmentProfileProvider executionEnvironmentProfileProvider) {
        super(uri, executionEnvironmentProfileProvider);
    }

    public void addFeature(EclipseFeature eclipseFeature) {
        addBundle(PluginAdapter.featureAsBundle(getBaseUri(), eclipseFeature));
        Iterator<EclipsePlugin> it = eclipseFeature.getPlugins().iterator();
        while (it.hasNext()) {
            addBundle(PluginAdapter.pluginAsBundle(getBaseUri(), it.next()));
        }
    }
}
