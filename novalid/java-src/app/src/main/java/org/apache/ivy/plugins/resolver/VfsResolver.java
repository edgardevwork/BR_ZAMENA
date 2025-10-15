package org.apache.ivy.plugins.resolver;

import io.ktor.util.date.GMTDateParser;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.ivy.plugins.repository.vfs.VfsRepository;

/* loaded from: classes7.dex */
public class VfsResolver extends RepositoryResolver {
    public static final int PASSWORD_GROUP = 2;
    public static final Pattern URL_PATTERN = Pattern.compile("[a-z]*://(.+):(.+)@.*");

    public VfsResolver() {
        setRepository(new VfsRepository(new LazyTimeoutConstraint(this)));
    }

    @Override // org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.AbstractResolver
    public String getTypeName() {
        return "vfs";
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver
    public String hidePassword(String str) {
        return prepareForDisplay(str);
    }

    public static String prepareForDisplay(String str) {
        StringBuilder sb = new StringBuilder(str);
        Matcher matcher = URL_PATTERN.matcher(sb);
        if (matcher.matches()) {
            String strGroup = matcher.group(2);
            int iIndexOf = sb.indexOf(strGroup);
            StringBuilder sb2 = new StringBuilder(strGroup);
            for (int i = 0; i < strGroup.length(); i++) {
                sb2.setCharAt(i, GMTDateParser.ANY);
            }
            sb = sb.replace(iIndexOf, strGroup.length() + iIndexOf, sb2.toString());
        }
        return sb.toString();
    }
}
