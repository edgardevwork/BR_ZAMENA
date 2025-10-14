package org.apache.ivy.core.module.status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.util.Message;

/* loaded from: classes7.dex */
public class StatusManager {
    public String defaultStatus;
    public String deliveryStatusListString;
    public Map<String, Boolean> statusIntegrationMap;
    public Map<String, Integer> statusPriorityMap;
    public final List<Status> statuses;

    public static StatusManager newDefaultInstance() {
        return new StatusManager(new Status[]{new Status("release", false), new Status("milestone", false), new Status("integration", true)}, "integration");
    }

    public static StatusManager getCurrent() {
        return IvyContext.getContext().getSettings().getStatusManager();
    }

    public StatusManager(Status[] statusArr, String str) {
        ArrayList arrayList = new ArrayList();
        this.statuses = arrayList;
        arrayList.addAll(Arrays.asList(statusArr));
        this.defaultStatus = str;
        computeMaps();
    }

    public StatusManager() {
        this.statuses = new ArrayList();
    }

    public void addStatus(Status status) {
        this.statuses.add(status);
    }

    public void setDefaultStatus(String str) {
        this.defaultStatus = str;
    }

    public List<Status> getStatuses() {
        return this.statuses;
    }

    public final void computeMaps() {
        if (this.statuses.isEmpty()) {
            throw new IllegalStateException("badly configured statuses: none found");
        }
        this.statusPriorityMap = new HashMap();
        for (Status status : this.statuses) {
            this.statusPriorityMap.put(status.getName(), Integer.valueOf(this.statuses.indexOf(status)));
        }
        this.statusIntegrationMap = new HashMap();
        for (Status status2 : this.statuses) {
            this.statusIntegrationMap.put(status2.getName(), Boolean.valueOf(status2.isIntegration()));
        }
    }

    public boolean isStatus(String str) {
        if (this.statusPriorityMap == null) {
            computeMaps();
        }
        return this.statusPriorityMap.containsKey(str);
    }

    public int getPriority(String str) {
        if (this.statusPriorityMap == null) {
            computeMaps();
        }
        Integer num = this.statusPriorityMap.get(str);
        if (num == null) {
            Message.debug("unknown status " + str + ": assuming lowest priority");
            return Integer.MAX_VALUE;
        }
        return num.intValue();
    }

    public boolean isIntegration(String str) {
        if (this.statusIntegrationMap == null) {
            computeMaps();
        }
        Boolean bool = this.statusIntegrationMap.get(str);
        if (bool == null) {
            Message.debug("unknown status " + str + ": assuming integration");
            return true;
        }
        return bool.booleanValue();
    }

    public String getDeliveryStatusListString() {
        if (this.deliveryStatusListString == null) {
            StringBuilder sb = new StringBuilder();
            for (Status status : this.statuses) {
                if (!status.isIntegration()) {
                    sb.append(status.getName());
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            this.deliveryStatusListString = sb.toString();
        }
        return this.deliveryStatusListString;
    }

    public String getDefaultStatus() {
        if (this.defaultStatus == null) {
            if (this.statuses.isEmpty()) {
                throw new IllegalStateException("badly configured statuses: none found");
            }
            this.defaultStatus = this.statuses.get(r0.size() - 1).getName();
        }
        return this.defaultStatus;
    }
}
