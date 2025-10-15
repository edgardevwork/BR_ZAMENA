package org.apache.ivy.osgi.updatesite;

import com.blackhub.bronline.launcher.LauncherConstants;
import java.net.URI;
import org.apache.ivy.osgi.core.BundleArtifact;
import org.apache.ivy.osgi.core.BundleInfo;
import org.apache.ivy.osgi.core.BundleRequirement;
import org.apache.ivy.osgi.updatesite.xml.EclipseFeature;
import org.apache.ivy.osgi.updatesite.xml.EclipsePlugin;
import org.apache.ivy.osgi.updatesite.xml.Require;
import org.apache.ivy.osgi.util.VersionRange;

/* loaded from: classes5.dex */
public class PluginAdapter {
    public static BundleInfo featureAsBundle(URI uri, EclipseFeature eclipseFeature) {
        String feature;
        BundleInfo bundleInfo = new BundleInfo(eclipseFeature.getId(), eclipseFeature.getVersion());
        bundleInfo.addArtifact(new BundleArtifact(false, eclipseFeature.getUrl() == null ? uri.resolve("features/" + eclipseFeature.getId() + LauncherConstants.UNDERSCORE_CHAR + eclipseFeature.getVersion() + ".jar") : uri.resolve(eclipseFeature.getUrl()), null));
        bundleInfo.setDescription(eclipseFeature.getDescription());
        bundleInfo.setLicense(eclipseFeature.getLicense());
        for (EclipsePlugin eclipsePlugin : eclipseFeature.getPlugins()) {
            bundleInfo.addRequirement(new BundleRequirement(BundleInfo.BUNDLE_TYPE, eclipsePlugin.getId(), new VersionRange(eclipsePlugin.getVersion()), null));
        }
        for (Require require : eclipseFeature.getRequires()) {
            if (require.getPlugin() != null) {
                feature = require.getPlugin();
            } else {
                feature = require.getFeature();
            }
            if (!require.getMatch().equals("greaterOrEqual")) {
                throw new IllegalStateException("unsupported match " + require.getMatch());
            }
            bundleInfo.addRequirement(new BundleRequirement(BundleInfo.BUNDLE_TYPE, feature, new VersionRange(require.getVersion()), null));
        }
        return bundleInfo;
    }

    public static BundleInfo pluginAsBundle(URI uri, EclipsePlugin eclipsePlugin) {
        BundleInfo bundleInfo = new BundleInfo(eclipsePlugin.getId(), eclipsePlugin.getVersion());
        bundleInfo.addArtifact(new BundleArtifact(false, uri.resolve("plugins/" + eclipsePlugin.getId() + LauncherConstants.UNDERSCORE_CHAR + eclipsePlugin.getVersion() + ".jar"), null));
        return bundleInfo;
    }
}
