package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C8831Ck;
import io.appmetrica.analytics.impl.C8940H4;
import io.appmetrica.analytics.impl.C9240Th;
import io.appmetrica.analytics.impl.C9350Y7;
import io.appmetrica.analytics.impl.C9374Z7;
import io.appmetrica.analytics.impl.C9438bm;
import io.appmetrica.analytics.impl.C9486dk;
import io.appmetrica.analytics.impl.C9897u6;
import io.appmetrica.analytics.impl.InterfaceC9489dn;

/* loaded from: classes5.dex */
public class GenderAttribute {

    /* renamed from: a */
    private final C9897u6 f9646a = new C9897u6("appmetrica_gender", new C9374Z7(), new C8831Ck());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* renamed from: a */
        private final String f9648a;

        Gender(String str) {
            this.f9648a = str;
        }

        public String getStringValue() {
            return this.f9648a;
        }
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC9489dn> withValue(@NonNull Gender gender) {
        String str = this.f9646a.f9165c;
        String stringValue = gender.getStringValue();
        C9350Y7 c9350y7 = new C9350Y7();
        C9897u6 c9897u6 = this.f9646a;
        return new UserProfileUpdate<>(new C9438bm(str, stringValue, c9350y7, c9897u6.f9163a, new C8940H4(c9897u6.f9164b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC9489dn> withValueIfUndefined(@NonNull Gender gender) {
        String str = this.f9646a.f9165c;
        String stringValue = gender.getStringValue();
        C9350Y7 c9350y7 = new C9350Y7();
        C9897u6 c9897u6 = this.f9646a;
        return new UserProfileUpdate<>(new C9438bm(str, stringValue, c9350y7, c9897u6.f9163a, new C9486dk(c9897u6.f9164b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC9489dn> withValueReset() {
        C9897u6 c9897u6 = this.f9646a;
        return new UserProfileUpdate<>(new C9240Th(0, c9897u6.f9165c, c9897u6.f9163a, c9897u6.f9164b));
    }
}
