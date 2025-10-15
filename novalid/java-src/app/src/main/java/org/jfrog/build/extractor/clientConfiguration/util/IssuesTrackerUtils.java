package org.jfrog.build.extractor.clientConfiguration.util;

import com.blackhub.bronline.game.gui.notification.utils.NotificationGeneralUseful;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.build.extractor.p065ci.Issue;

/* loaded from: classes7.dex */
public class IssuesTrackerUtils {
    public static Set<Issue> getAffectedIssuesSet(String str) {
        HashSet hashSet = new HashSet();
        if (StringUtils.isNotBlank(str)) {
            for (String str2 : str.split(",")) {
                String[] strArrSplit = str2.split(NotificationGeneralUseful.TEXT_DOUBLE_ARROW);
                if (strArrSplit.length == 3) {
                    hashSet.add(new Issue(strArrSplit[0], strArrSplit[1], strArrSplit[2]));
                }
            }
        }
        return hashSet;
    }
}
