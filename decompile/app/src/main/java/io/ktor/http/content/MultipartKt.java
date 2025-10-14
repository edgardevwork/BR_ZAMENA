package io.ktor.http.content;

import androidx.media3.extractor.text.cea.Cea708Decoder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Multipart.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\"\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n*\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m7105d2 = {"forEachPart", "", "Lio/ktor/http/content/MultiPartData;", "partHandler", "Lkotlin/Function2;", "Lio/ktor/http/content/PartData;", "Lkotlin/coroutines/Continuation;", "", "(Lio/ktor/http/content/MultiPartData;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAllParts", "", "(Lio/ktor/http/content/MultiPartData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class MultipartKt {

    /* compiled from: Multipart.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.http.content.MultipartKt", m7120f = "Multipart.kt", m7121i = {0, 0, 1, 1}, m7122l = {128, 129}, m7123m = "forEachPart", m7124n = {"$this$forEachPart", "partHandler", "$this$forEachPart", "partHandler"}, m7125s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.http.content.MultipartKt$forEachPart$1 */
    public static final class C103301 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C103301(Continuation<? super C103301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultipartKt.forEachPart(null, null, this);
        }
    }

    /* compiled from: Multipart.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.http.content.MultipartKt", m7120f = "Multipart.kt", m7121i = {0, 1, 1}, m7122l = {138, Cea708Decoder.COMMAND_RST}, m7123m = "readAllParts", m7124n = {"$this$readAllParts", "$this$readAllParts", "parts"}, m7125s = {"L$0", "L$0", "L$1"})
    /* renamed from: io.ktor.http.content.MultipartKt$readAllParts$1 */
    public static final class C103311 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C103311(Continuation<? super C103311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultipartKt.readAllParts(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006f -> B:13:0x0033). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object forEachPart(@NotNull MultiPartData multiPartData, @NotNull Function2<? super PartData, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C103301 c103301;
        MultiPartData multiPartData2;
        Function2<? super PartData, ? super Continuation<? super Unit>, ? extends Object> function22;
        PartData partData;
        if (continuation instanceof C103301) {
            c103301 = (C103301) continuation;
            int i = c103301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103301.label = i - Integer.MIN_VALUE;
            } else {
                c103301 = new C103301(continuation);
            }
        }
        Object part = c103301.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c103301.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(part);
            c103301.L$0 = multiPartData;
            c103301.L$1 = function2;
            c103301.label = 1;
            part = multiPartData.readPart(c103301);
            if (part == coroutine_suspended) {
            }
        } else if (i2 == 1) {
            function22 = (Function2) c103301.L$1;
            multiPartData2 = (MultiPartData) c103301.L$0;
            ResultKt.throwOnFailure(part);
            partData = (PartData) part;
            if (partData == null) {
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function22 = (Function2) c103301.L$1;
            multiPartData2 = (MultiPartData) c103301.L$0;
            ResultKt.throwOnFailure(part);
            MultiPartData multiPartData3 = multiPartData2;
            function2 = function22;
            multiPartData = multiPartData3;
            c103301.L$0 = multiPartData;
            c103301.L$1 = function2;
            c103301.label = 1;
            part = multiPartData.readPart(c103301);
            if (part == coroutine_suspended) {
                return coroutine_suspended;
            }
            Function2<? super PartData, ? super Continuation<? super Unit>, ? extends Object> function23 = function2;
            multiPartData2 = multiPartData;
            function22 = function23;
            partData = (PartData) part;
            if (partData == null) {
                c103301.L$0 = multiPartData2;
                c103301.L$1 = function22;
                c103301.label = 2;
                if (function22.invoke(partData, c103301) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                MultiPartData multiPartData32 = multiPartData2;
                function2 = function22;
                multiPartData = multiPartData32;
                c103301.L$0 = multiPartData;
                c103301.L$1 = function2;
                c103301.label = 1;
                part = multiPartData.readPart(c103301);
                if (part == coroutine_suspended) {
                }
            } else {
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0070 -> B:27:0x0073). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readAllParts(@NotNull MultiPartData multiPartData, @NotNull Continuation<? super List<? extends PartData>> continuation) throws Throwable {
        C103311 c103311;
        MultiPartData multiPartData2;
        ArrayList arrayList;
        PartData partData;
        if (continuation instanceof C103311) {
            c103311 = (C103311) continuation;
            int i = c103311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103311.label = i - Integer.MIN_VALUE;
            } else {
                c103311 = new C103311(continuation);
            }
        }
        Object part = c103311.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c103311.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(part);
            c103311.L$0 = multiPartData;
            c103311.label = 1;
            part = multiPartData.readPart(c103311);
            if (part == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 1) {
            multiPartData = (MultiPartData) c103311.L$0;
            ResultKt.throwOnFailure(part);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (ArrayList) c103311.L$1;
            multiPartData2 = (MultiPartData) c103311.L$0;
            ResultKt.throwOnFailure(part);
            partData = (PartData) part;
            if (partData == null) {
                return arrayList;
            }
            arrayList.add(partData);
            c103311.L$0 = multiPartData2;
            c103311.L$1 = arrayList;
            c103311.label = 2;
            part = multiPartData2.readPart(c103311);
            if (part == coroutine_suspended) {
                return coroutine_suspended;
            }
            partData = (PartData) part;
            if (partData == null) {
            }
        }
        PartData partData2 = (PartData) part;
        if (partData2 == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(partData2);
        multiPartData2 = multiPartData;
        arrayList = arrayList2;
        c103311.L$0 = multiPartData2;
        c103311.L$1 = arrayList;
        c103311.label = 2;
        part = multiPartData2.readPart(c103311);
        if (part == coroutine_suspended) {
        }
        partData = (PartData) part;
        if (partData == null) {
        }
    }
}
