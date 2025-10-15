package ru.rustore.sdk.billingclient.impl.presentation.viewmodel;

import com.blackhub.bronline.launcher.LauncherConstants;
import kotlin.Deprecated;
import ru.rustore.sdk.billingclient.C11403R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Deprecated(message = "RUSTORE-39764 Удалить вместе с resolveForBilling")
/* renamed from: ru.rustore.sdk.billingclient.impl.presentation.viewmodel.a */
/* loaded from: classes7.dex */
public final class EnumC11547a {

    /* renamed from: e */
    public static final a f10582e;

    /* renamed from: f */
    public static final EnumC11547a f10583f;

    /* renamed from: g */
    public static final EnumC11547a f10584g;

    /* renamed from: h */
    public static final EnumC11547a f10585h;

    /* renamed from: i */
    public static final EnumC11547a f10586i;

    /* renamed from: j */
    public static final EnumC11547a f10587j;

    /* renamed from: k */
    public static final EnumC11547a f10588k;

    /* renamed from: l */
    public static final /* synthetic */ EnumC11547a[] f10589l;

    /* renamed from: a */
    public final int f10590a;

    /* renamed from: b */
    public final int f10591b;

    /* renamed from: c */
    public final Integer f10592c;

    /* renamed from: d */
    public final Integer f10593d;

    /* renamed from: ru.rustore.sdk.billingclient.impl.presentation.viewmodel.a$a */
    public static final class a {
    }

    static {
        EnumC11547a enumC11547a = new EnumC11547a("NOT_INSTALLED", 0, C11403R.string.ru_store_not_installed_title, C11403R.string.ru_store_not_installed_text, null, Integer.valueOf(C11403R.string.ru_store_not_installed_button), 4);
        f10583f = enumC11547a;
        EnumC11547a enumC11547a2 = new EnumC11547a("OUTDATED", 1, C11403R.string.ru_store_outdated_title, C11403R.string.ru_store_outdated_text, null, Integer.valueOf(C11403R.string.ru_store_outdated_button), 4);
        f10584g = enumC11547a2;
        EnumC11547a enumC11547a3 = new EnumC11547a("USER_UNAUTHORIZED", 2, C11403R.string.ru_store_user_unauthorized_title, C11403R.string.ru_store_user_unauthorized_text, null, Integer.valueOf(C11403R.string.ru_store_user_unauthorized_button), 4);
        f10585h = enumC11547a3;
        int i = C11403R.string.ru_store_payment_unavailable_title;
        int i2 = C11403R.string.ru_store_payment_unavailable_user_banned_text;
        int i3 = C11403R.string.common_close;
        EnumC11547a enumC11547a4 = new EnumC11547a("USER_BANNED", 3, i, i2, Integer.valueOf(i3), null, 8);
        f10586i = enumC11547a4;
        EnumC11547a enumC11547a5 = new EnumC11547a("APPLICATION_BANNED", 4, i, C11403R.string.ru_store_payment_unavailable_app_banned_text, Integer.valueOf(i3), null, 8);
        f10587j = enumC11547a5;
        EnumC11547a enumC11547a6 = new EnumC11547a(LauncherConstants.ERROR_KEY, 5, i, C11403R.string.ru_store_payment_unavailable_text, Integer.valueOf(i3), null, 8);
        f10588k = enumC11547a6;
        f10589l = new EnumC11547a[]{enumC11547a, enumC11547a2, enumC11547a3, enumC11547a4, enumC11547a5, enumC11547a6};
        f10582e = new a();
    }

    public EnumC11547a() {
        throw null;
    }

    public EnumC11547a(String str, int i, int i2, int i3, Integer num, Integer num2, int i4) {
        num = (i4 & 4) != 0 ? Integer.valueOf(C11403R.string.common_not_now) : num;
        num2 = (i4 & 8) != 0 ? null : num2;
        this.f10590a = i2;
        this.f10591b = i3;
        this.f10592c = num;
        this.f10593d = num2;
    }

    public static EnumC11547a valueOf(String str) {
        return (EnumC11547a) Enum.valueOf(EnumC11547a.class, str);
    }

    public static EnumC11547a[] values() {
        return (EnumC11547a[]) f10589l.clone();
    }
}
