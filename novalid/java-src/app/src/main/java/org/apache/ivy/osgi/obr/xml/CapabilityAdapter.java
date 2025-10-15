package org.apache.ivy.osgi.obr.xml;

import java.text.ParseException;
import org.apache.ivy.osgi.core.BundleCapability;
import org.apache.ivy.osgi.core.BundleInfo;
import org.apache.ivy.osgi.core.ExportPackage;
import org.apache.ivy.osgi.util.Version;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;

/* loaded from: classes5.dex */
public class CapabilityAdapter {
    public static void adapt(BundleInfo bundleInfo, Capability capability) throws ParseException {
        String name;
        name = capability.getName();
        name.hashCode();
        switch (name) {
            case "bundle":
                break;
            case "package":
                bundleInfo.addCapability(getExportPackage(bundleInfo, capability));
                break;
            case "service":
                bundleInfo.addCapability(getOSGiService(bundleInfo, capability));
                break;
            default:
                Message.warn("Unsupported capability '" + name + "' on the bundle '" + bundleInfo.getSymbolicName() + "'");
                break;
        }
    }

    public static ExportPackage getExportPackage(BundleInfo bundleInfo, Capability capability) throws ParseException {
        String name;
        String value = null;
        Version version = null;
        String value2 = null;
        for (CapabilityProperty capabilityProperty : capability.getProperties()) {
            name = capabilityProperty.getName();
            name.hashCode();
            switch (name) {
                case "package":
                    value = capabilityProperty.getValue();
                    break;
                case "uses":
                    value2 = capabilityProperty.getValue();
                    break;
                case "version":
                    version = new Version(capabilityProperty.getValue());
                    break;
                default:
                    Message.warn("Unsupported property '" + name + "' on the 'package' capability of the bundle '" + bundleInfo.getSymbolicName() + "'");
                    break;
            }
        }
        if (value == null) {
            throw new ParseException("No package name for the capability", 0);
        }
        ExportPackage exportPackage = new ExportPackage(value, version);
        if (value2 != null) {
            for (String str : StringUtils.splitToArray(value2)) {
                exportPackage.addUse(str);
            }
        }
        return exportPackage;
    }

    public static BundleCapability getOSGiService(BundleInfo bundleInfo, Capability capability) throws ParseException {
        String value = null;
        Version version = null;
        for (CapabilityProperty capabilityProperty : capability.getProperties()) {
            String name = capabilityProperty.getName();
            name.hashCode();
            if (!name.equals("version")) {
                if (name.equals("service")) {
                    value = capabilityProperty.getValue();
                } else {
                    Message.warn("Unsupported property '" + name + "' on the 'package' capability of the bundle '" + bundleInfo.getSymbolicName() + "'");
                }
            } else {
                version = new Version(capabilityProperty.getValue());
            }
        }
        if (value == null) {
            throw new ParseException("No service name for the capability", 0);
        }
        return new BundleCapability("service", value, version);
    }
}
