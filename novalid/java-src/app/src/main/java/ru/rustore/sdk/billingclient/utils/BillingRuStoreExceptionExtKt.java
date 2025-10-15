package ru.rustore.sdk.billingclient.utils;

import android.content.Context;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.presentation.viewmodel.C11548b;
import ru.rustore.sdk.billingclient.impl.presentation.viewmodel.EnumC11547a;
import ru.rustore.sdk.core.exception.RuStoreApplicationBannedException;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.exception.RuStoreNotInstalledException;
import ru.rustore.sdk.core.exception.RuStoreOutdatedException;
import ru.rustore.sdk.core.exception.RuStoreUserBannedException;
import ru.rustore.sdk.core.exception.RuStoreUserUnauthorizedException;
import ru.rustore.sdk.core.util.RuStoreUtils;
import ru.rustore.sdk.coreui.DialogHelperKt;

@Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m7105d2 = {"resolveForBilling", "", "Lru/rustore/sdk/core/exception/RuStoreException;", "context", "Landroid/content/Context;", "sdk-public-billingclient_release"}, m7106k = 2, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class BillingRuStoreExceptionExtKt {
    @Deprecated(message = "Обработку ошибок типа RuStoreException необходимо производить на своей стороне")
    public static final void resolveForBilling(RuStoreException exception, final Context context) {
        Intrinsics.checkNotNullParameter(exception, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        EnumC11547a.f10582e.getClass();
        Intrinsics.checkNotNullParameter(exception, "exception");
        DialogHelperKt.showDialog$default(context, new C11548b(exception instanceof RuStoreNotInstalledException ? EnumC11547a.f10583f : exception instanceof RuStoreOutdatedException ? EnumC11547a.f10584g : exception instanceof RuStoreUserUnauthorizedException ? EnumC11547a.f10585h : exception instanceof RuStoreUserBannedException ? EnumC11547a.f10586i : exception instanceof RuStoreApplicationBannedException ? EnumC11547a.f10587j : EnumC11547a.f10588k), new Function1<C11548b, Unit>() { // from class: ru.rustore.sdk.billingclient.utils.BillingRuStoreExceptionExtKt.resolveForBilling.1

            @Metadata(m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
            /* renamed from: ru.rustore.sdk.billingclient.utils.BillingRuStoreExceptionExtKt$resolveForBilling$1$WhenMappings */
            /* loaded from: classes7.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnumC11547a.values().length];
                    try {
                        iArr[EnumC11547a.f10583f.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC11547a.f10584g.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC11547a.f10585h.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[EnumC11547a.f10586i.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[EnumC11547a.f10587j.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[EnumC11547a.f10588k.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C11548b c11548b) {
                invoke2(c11548b);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C11548b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int iOrdinal = state.f10594a.ordinal();
                if (iOrdinal == 0) {
                    RuStoreUtils.INSTANCE.openRuStoreDownloadInstruction(context);
                } else if (iOrdinal == 1) {
                    RuStoreUtils.INSTANCE.openRuStore(context);
                } else {
                    if (iOrdinal != 2) {
                        return;
                    }
                    RuStoreUtils.INSTANCE.openRuStoreAuthorization(context);
                }
            }
        }, null, null, 24, null);
    }
}
