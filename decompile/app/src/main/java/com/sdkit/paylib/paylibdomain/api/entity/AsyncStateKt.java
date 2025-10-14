package com.sdkit.paylib.paylibdomain.api.entity;

import androidx.exifinterface.media.ExifInterface;
import com.sdkit.paylib.paylibdomain.api.entity.AsyncState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u001aD\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\u0002*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00020\u0006H\u0086\bø\u0001\u0000\u001a \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, m7105d2 = {"mapContent", "Lcom/sdkit/paylib/paylibdomain/api/entity/AsyncState;", "R", ExifInterface.GPS_DIRECTION_TRUE, "", "mapper", "Lkotlin/Function1;", "mapUnit", "", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class AsyncStateKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> AsyncState<R> mapContent(AsyncState<? extends T> asyncState, Function1<? super T, ? extends R> mapper) {
        Intrinsics.checkNotNullParameter(asyncState, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        if (asyncState instanceof AsyncState.Content) {
            return new AsyncState.Content(mapper.invoke((Object) ((AsyncState.Content) asyncState).getContent()));
        }
        if ((asyncState instanceof AsyncState.None) || (asyncState instanceof AsyncState.Loading) || (asyncState instanceof AsyncState.Error)) {
            return asyncState;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> AsyncState<Unit> mapUnit(AsyncState<? extends T> asyncState) {
        Intrinsics.checkNotNullParameter(asyncState, "<this>");
        if (asyncState instanceof AsyncState.Content) {
            ((AsyncState.Content) asyncState).getContent();
            return new AsyncState.Content(Unit.INSTANCE);
        }
        if ((asyncState instanceof AsyncState.None) || (asyncState instanceof AsyncState.Loading) || (asyncState instanceof AsyncState.Error)) {
            return asyncState;
        }
        throw new NoWhenBranchMatchedException();
    }
}
