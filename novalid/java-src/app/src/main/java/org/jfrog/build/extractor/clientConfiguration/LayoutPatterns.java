package org.jfrog.build.extractor.clientConfiguration;

/* loaded from: classes7.dex */
public interface LayoutPatterns {
    public static final String DEFAULT_IVY_PATTERN = "[organisation]/[module]/ivy-[revision].xml";
    public static final String M2_PATTERN = "[organisation]/[module]/[revision]/[artifact]-[revision](-[classifier]).[ext]";
    public static final String M2_PER_MODULE_PATTERN = "[revision]/[artifact]-[revision](-[classifier]).[ext]";
}
