package org.apache.ivy.core.event;

import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.ivy.plugins.matcher.ExactPatternMatcher;
import org.apache.ivy.plugins.matcher.Matcher;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.util.StringUtils;
import org.apache.ivy.util.filter.AndFilter;
import org.apache.ivy.util.filter.Filter;
import org.apache.ivy.util.filter.NoFilter;
import org.apache.ivy.util.filter.NotFilter;
import org.apache.ivy.util.filter.OrFilter;

/* loaded from: classes7.dex */
public class IvyEventFilter implements Filter<IvyEvent> {
    public static final String AND = " AND ";
    public static final String NOT = "NOT ";

    /* renamed from: OR */
    public static final String f9956OR = " OR ";
    public Filter<IvyEvent> attFilter;
    public PatternMatcher matcher;
    public Filter<IvyEvent> nameFilter;

    public IvyEventFilter(String str, String str2, PatternMatcher patternMatcher) {
        patternMatcher = patternMatcher == null ? ExactPatternMatcher.INSTANCE : patternMatcher;
        this.matcher = patternMatcher;
        if (str == null) {
            this.nameFilter = NoFilter.instance();
        } else {
            final Matcher matcher = patternMatcher.getMatcher(str);
            this.nameFilter = new Filter<IvyEvent>() { // from class: org.apache.ivy.core.event.IvyEventFilter.1
                @Override // org.apache.ivy.util.filter.Filter
                public boolean accept(IvyEvent ivyEvent) {
                    return matcher.matches(ivyEvent.getName());
                }
            };
        }
        if (StringUtils.isNullOrEmpty(str2)) {
            this.attFilter = NoFilter.instance();
        } else {
            this.attFilter = parseExpression(str2);
        }
    }

    public final Filter<IvyEvent> parseExpression(String str) {
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(AND);
        if (iIndexOf == -1) {
            int iIndexOf2 = strTrim.indexOf(f9956OR);
            if (iIndexOf2 == -1) {
                if (strTrim.startsWith(NOT)) {
                    return new NotFilter(parseExpression(strTrim.substring(4)));
                }
                int iIndexOf3 = strTrim.indexOf(URLEncodedUtils.NAME_VALUE_SEPARATOR);
                if (iIndexOf3 == -1) {
                    throw new IllegalArgumentException("bad filter expression: " + strTrim + ": no equal sign found");
                }
                final String strTrim2 = strTrim.substring(0, iIndexOf3).trim();
                final ArrayList arrayList = new ArrayList();
                for (String str2 : StringUtils.splitToArray(strTrim.substring(iIndexOf3 + 1))) {
                    arrayList.add(this.matcher.getMatcher(str2));
                }
                return new Filter<IvyEvent>() { // from class: org.apache.ivy.core.event.IvyEventFilter.2
                    @Override // org.apache.ivy.util.filter.Filter
                    public boolean accept(IvyEvent ivyEvent) {
                        String str3 = ivyEvent.getAttributes().get(strTrim2);
                        if (str3 == null) {
                            return false;
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((Matcher) it.next()).matches(str3)) {
                                return true;
                            }
                        }
                        return false;
                    }
                };
            }
            return new OrFilter(parseExpression(strTrim.substring(0, iIndexOf2)), parseExpression(strTrim.substring(iIndexOf2 + 4)));
        }
        return new AndFilter(parseExpression(strTrim.substring(0, iIndexOf)), parseExpression(strTrim.substring(iIndexOf + 5)));
    }

    @Override // org.apache.ivy.util.filter.Filter
    public boolean accept(IvyEvent ivyEvent) {
        return this.nameFilter.accept(ivyEvent) && this.attFilter.accept(ivyEvent);
    }
}
