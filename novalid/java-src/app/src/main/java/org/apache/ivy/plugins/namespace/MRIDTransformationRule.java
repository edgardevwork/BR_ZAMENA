package org.apache.ivy.plugins.namespace;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public class MRIDTransformationRule implements NamespaceTransformer {
    public MRIDRule dest;
    public final List<MRIDRule> src = new ArrayList();

    @Override // org.apache.ivy.plugins.namespace.NamespaceTransformer
    public boolean isIdentity() {
        return false;
    }

    /* loaded from: classes6.dex */
    public static class MridRuleMatcher {
        public static final String[] TYPES = {"o", "m", "b", "r"};
        public Matcher[] matchers;

        public MridRuleMatcher() {
            this.matchers = new Matcher[TYPES.length];
        }

        public boolean match(MRIDRule mRIDRule, ModuleRevisionId moduleRevisionId) {
            this.matchers[0] = Pattern.compile(getPattern(mRIDRule.getOrg())).matcher(moduleRevisionId.getOrganisation());
            if (!this.matchers[0].matches()) {
                return false;
            }
            this.matchers[1] = Pattern.compile(getPattern(mRIDRule.getModule())).matcher(moduleRevisionId.getName());
            if (!this.matchers[1].matches()) {
                return false;
            }
            if (moduleRevisionId.getBranch() == null) {
                this.matchers[2] = null;
            } else {
                this.matchers[2] = Pattern.compile(getPattern(mRIDRule.getBranch())).matcher(moduleRevisionId.getBranch());
                if (!this.matchers[2].matches()) {
                    return false;
                }
            }
            this.matchers[3] = Pattern.compile(getPattern(mRIDRule.getRev())).matcher(moduleRevisionId.getRevision());
            return this.matchers[3].matches();
        }

        public ModuleRevisionId apply(MRIDRule mRIDRule, ModuleRevisionId moduleRevisionId) {
            return ModuleRevisionId.newInstance(applyRules(mRIDRule.getOrg(), "o"), applyRules(mRIDRule.getModule(), "m"), applyRules(mRIDRule.getBranch(), "b"), applyRules(mRIDRule.getRev(), "r"), moduleRevisionId.getQualifiedExtraAttributes());
        }

        public final String applyRules(String str, String str2) {
            int i = 0;
            while (true) {
                String[] strArr = TYPES;
                if (i >= strArr.length) {
                    return str;
                }
                str = applyTypeRule(str, strArr[i], str2, this.matchers[i]);
                i++;
            }
        }

        public final String applyTypeRule(String str, String str2, String str3, Matcher matcher) {
            if (matcher == null) {
                return str;
            }
            String strReplaceAll = str == null ? "$" + str3 + "0" : str;
            for (String str4 : TYPES) {
                strReplaceAll = str4.equals(str2) ? strReplaceAll.replaceAll("([^\\\\])\\$" + str2, "$1\\$").replaceAll("^\\$" + str2, "\\$") : strReplaceAll.replaceAll("([^\\\\])\\$" + str4, "$1\\\\\\$" + str4).replaceAll("^\\$" + str4, "\\\\\\$" + str4);
            }
            StringBuffer stringBuffer = new StringBuffer();
            matcher.reset();
            matcher.find();
            matcher.appendReplacement(stringBuffer, strReplaceAll);
            String string = stringBuffer.toString();
            if (str == null) {
                if (("$" + str3 + "0").equals(string)) {
                    return null;
                }
            }
            return string;
        }

        public final String getPattern(String str) {
            return str == null ? SegmentConstantPool.REGEX_MATCH_ALL : str;
        }
    }

    public void addSrc(MRIDRule mRIDRule) {
        this.src.add(mRIDRule);
    }

    public void addDest(MRIDRule mRIDRule) {
        if (this.dest != null) {
            throw new IllegalArgumentException("only one dest is allowed per mapping");
        }
        this.dest = mRIDRule;
    }

    @Override // org.apache.ivy.plugins.namespace.NamespaceTransformer
    public ModuleRevisionId transform(ModuleRevisionId moduleRevisionId) {
        MridRuleMatcher mridRuleMatcher = new MridRuleMatcher();
        for (MRIDRule mRIDRule : this.src) {
            if (mridRuleMatcher.match(mRIDRule, moduleRevisionId)) {
                ModuleRevisionId moduleRevisionIdApply = mridRuleMatcher.apply(this.dest, moduleRevisionId);
                Message.debug("found matching namespace rule: " + mRIDRule + ". Applied " + this.dest + " on " + moduleRevisionId + ". Transformed to " + moduleRevisionIdApply);
                return moduleRevisionIdApply;
            }
        }
        return moduleRevisionId;
    }
}
