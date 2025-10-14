package org.apache.commons.p059io.file;

import org.apache.commons.p059io.IOUtils;

/* loaded from: classes5.dex */
public enum StandardDeleteOption implements DeleteOption {
    OVERRIDE_READ_ONLY;

    public static boolean overrideReadOnly(DeleteOption[] deleteOptionArr) {
        if (IOUtils.length(deleteOptionArr) == 0) {
            return false;
        }
        for (DeleteOption deleteOption : deleteOptionArr) {
            if (deleteOption == OVERRIDE_READ_ONLY) {
                return true;
            }
        }
        return false;
    }
}
