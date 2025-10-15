package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.InterfaceC9489dn;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes5.dex */
public class UserProfile {

    /* renamed from: a */
    private final List f9652a;

    public static class Builder {

        /* renamed from: a */
        private final LinkedList f9653a;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder apply(@NonNull UserProfileUpdate<? extends InterfaceC9489dn> userProfileUpdate) {
            this.f9653a.add(userProfileUpdate);
            return this;
        }

        @NonNull
        public UserProfile build() {
            return new UserProfile(this.f9653a, 0);
        }

        private Builder() {
            this.f9653a = new LinkedList();
        }
    }

    public /* synthetic */ UserProfile(LinkedList linkedList, int i) {
        this(linkedList);
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(0);
    }

    @NonNull
    public List<UserProfileUpdate<? extends InterfaceC9489dn>> getUserProfileUpdates() {
        return this.f9652a;
    }

    private UserProfile(LinkedList linkedList) {
        this.f9652a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
