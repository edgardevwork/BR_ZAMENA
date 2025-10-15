package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.AbstractC9201S2;
import io.appmetrica.analytics.impl.C8831Ck;
import io.appmetrica.analytics.impl.C8940H4;
import io.appmetrica.analytics.impl.C9240Th;
import io.appmetrica.analytics.impl.C9350Y7;
import io.appmetrica.analytics.impl.C9374Z7;
import io.appmetrica.analytics.impl.C9438bm;
import io.appmetrica.analytics.impl.C9486dk;
import io.appmetrica.analytics.impl.C9897u6;
import io.appmetrica.analytics.impl.InterfaceC9489dn;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes5.dex */
public class BirthDateAttribute {

    /* renamed from: a */
    private final C9897u6 f9643a = new C9897u6("appmetrica_birth_date", new C9374Z7(), new C8831Ck());

    /* renamed from: a */
    public final UserProfileUpdate m7060a(Calendar calendar, String str, AbstractC9201S2 abstractC9201S2) {
        return new UserProfileUpdate(new C9438bm(this.f9643a.f9165c, new SimpleDateFormat(str).format(calendar.getTime()), new C9350Y7(), new C9374Z7(), abstractC9201S2));
    }

    public UserProfileUpdate<? extends InterfaceC9489dn> withAge(int i) {
        int i2 = Calendar.getInstance(Locale.US).get(1) - i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return m7060a(gregorianCalendar, "yyyy", new C8940H4(this.f9643a.f9164b));
    }

    public UserProfileUpdate<? extends InterfaceC9489dn> withAgeIfUndefined(int i) {
        int i2 = Calendar.getInstance(Locale.US).get(1) - i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return m7060a(gregorianCalendar, "yyyy", new C9486dk(this.f9643a.f9164b));
    }

    public UserProfileUpdate<? extends InterfaceC9489dn> withBirthDate(@NonNull Calendar calendar) {
        return m7060a(calendar, "yyyy-MM-dd", new C8940H4(this.f9643a.f9164b));
    }

    public UserProfileUpdate<? extends InterfaceC9489dn> withBirthDateIfUndefined(@NonNull Calendar calendar) {
        return m7060a(calendar, "yyyy-MM-dd", new C9486dk(this.f9643a.f9164b));
    }

    public UserProfileUpdate<? extends InterfaceC9489dn> withValueReset() {
        return new UserProfileUpdate<>(new C9240Th(0, this.f9643a.f9165c, new C9374Z7(), new C8831Ck()));
    }

    public UserProfileUpdate<? extends InterfaceC9489dn> withBirthDate(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return m7060a(gregorianCalendar, "yyyy", new C8940H4(this.f9643a.f9164b));
    }

    public UserProfileUpdate<? extends InterfaceC9489dn> withBirthDateIfUndefined(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return m7060a(gregorianCalendar, "yyyy", new C9486dk(this.f9643a.f9164b));
    }

    public UserProfileUpdate<? extends InterfaceC9489dn> withBirthDate(int i, int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, 1);
        return m7060a(gregorianCalendar, "yyyy-MM", new C8940H4(this.f9643a.f9164b));
    }

    public UserProfileUpdate<? extends InterfaceC9489dn> withBirthDateIfUndefined(int i, int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, 1);
        return m7060a(gregorianCalendar, "yyyy-MM", new C9486dk(this.f9643a.f9164b));
    }

    public UserProfileUpdate<? extends InterfaceC9489dn> withBirthDate(int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, i3);
        return m7060a(gregorianCalendar, "yyyy-MM-dd", new C8940H4(this.f9643a.f9164b));
    }

    public UserProfileUpdate<? extends InterfaceC9489dn> withBirthDateIfUndefined(int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, i3);
        return m7060a(gregorianCalendar, "yyyy-MM-dd", new C9486dk(this.f9643a.f9164b));
    }
}
