package org.apache.ivy.plugins.circular;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes6.dex */
public final class CircularDependencyHelper {
    public static String formatMessage(ModuleRevisionId[] moduleRevisionIdArr) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int length = moduleRevisionIdArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            ModuleRevisionId moduleRevisionId = moduleRevisionIdArr[i];
            if (sb.length() > 0) {
                sb.append("->");
            }
            if (hashSet.add(moduleRevisionId)) {
                sb.append(moduleRevisionId);
                i++;
            } else {
                sb.append("...");
                break;
            }
        }
        return sb.toString();
    }

    public static String formatMessage(ModuleDescriptor[] moduleDescriptorArr) {
        return formatMessageFromDescriptors(Arrays.asList(moduleDescriptorArr));
    }

    public static String formatMessageFromDescriptors(List<ModuleDescriptor> list) {
        LinkedList linkedList = new LinkedList();
        Iterator<ModuleDescriptor> it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().getModuleRevisionId());
        }
        return formatMessage((ModuleRevisionId[]) linkedList.toArray(new ModuleRevisionId[linkedList.size()]));
    }
}
