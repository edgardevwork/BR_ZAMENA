package org.apache.ivy.plugins.version;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes5.dex */
public class PatternVersionMatcher extends AbstractVersionMatcher {
    public final List<Match> matches = new ArrayList();
    public final Map<String, List<Match>> revisionMatches = new HashMap();
    public boolean init = false;

    public void addMatch(Match match) {
        this.matches.add(match);
    }

    public final void init() {
        if (this.init) {
            return;
        }
        for (Match match : this.matches) {
            List<Match> arrayList = this.revisionMatches.get(match.getRevision());
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.revisionMatches.put(match.getRevision(), arrayList);
            }
            arrayList.add(match);
        }
        this.init = true;
    }

    @Override // org.apache.ivy.plugins.version.VersionMatcher
    public boolean accept(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2) {
        init();
        String revision = moduleRevisionId.getRevision();
        int iIndexOf = revision.indexOf(40);
        boolean zMatches = false;
        if (iIndexOf > 0) {
            revision = revision.substring(0, iIndexOf);
        }
        List<Match> list = this.revisionMatches.get(revision);
        if (list != null) {
            Iterator<Match> it = list.iterator();
            while (it.hasNext() && !(zMatches = it.next().getPatternMatcher(moduleRevisionId).matches(moduleRevisionId2.getRevision()))) {
            }
        }
        return zMatches;
    }

    @Override // org.apache.ivy.plugins.version.VersionMatcher
    public boolean isDynamic(ModuleRevisionId moduleRevisionId) {
        init();
        String revision = moduleRevisionId.getRevision();
        int iIndexOf = revision.indexOf(40);
        if (iIndexOf > 0) {
            revision = revision.substring(0, iIndexOf);
        }
        return this.revisionMatches.containsKey(revision);
    }
}
