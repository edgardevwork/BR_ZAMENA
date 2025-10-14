package com.blackhub.bronline.game.gui.interactionwithnpc;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: InteractionWithNpcViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0015J\u0016\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcActionWithJSON;", "(Lcom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcActionWithJSON;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearScrollPosition", "", "initJson", "json", "Lorg/json/JSONObject;", "sendButtonClick", "buttonKey", "", "sendCloseScreen", "screen", "setRender", "widthSwScreen", "renderId", "updateJson", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nInteractionWithNpcViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractionWithNpcViewModel.kt\ncom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,143:1\n230#2,5:144\n230#2,5:149\n*S KotlinDebug\n*F\n+ 1 InteractionWithNpcViewModel.kt\ncom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel\n*L\n40#1:144,5\n139#1:149,5\n*E\n"})
/* loaded from: classes3.dex */
public final class InteractionWithNpcViewModel extends BaseViewModel<InteractionWithNpcUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<InteractionWithNpcUiState> _uiState;

    @NotNull
    public final InteractionWithNpcActionWithJSON actionWithJSON;

    @NotNull
    public final StateFlow<InteractionWithNpcUiState> uiState;

    @Inject
    public InteractionWithNpcViewModel(@NotNull InteractionWithNpcActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new InteractionWithNpcUiState(0, null, null, 0L, false, null, 0, null, false, false, false, false, UnixStat.PERM_MASK, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<InteractionWithNpcUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<InteractionWithNpcUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull JSONObject json) {
        InteractionWithNpcUiState value;
        InteractionWithNpcUiState interactionWithNpcUiState;
        Intrinsics.checkNotNullParameter(json, "json");
        MutableStateFlow<InteractionWithNpcUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            interactionWithNpcUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, interactionWithNpcUiState.copy((3969 & 1) != 0 ? interactionWithNpcUiState.screen : 0, (3969 & 2) != 0 ? interactionWithNpcUiState.textTitle : null, (3969 & 4) != 0 ? interactionWithNpcUiState.textDesc : null, (3969 & 8) != 0 ? interactionWithNpcUiState.typingSpeed : 0L, (3969 & 16) != 0 ? interactionWithNpcUiState.isSkipText : false, (3969 & 32) != 0 ? interactionWithNpcUiState.buttonList : null, (3969 & 64) != 0 ? interactionWithNpcUiState.renderId : -1, (3969 & 128) != 0 ? interactionWithNpcUiState.bitmap : null, (3969 & 256) != 0 ? interactionWithNpcUiState.isRenderNew : false, (3969 & 512) != 0 ? interactionWithNpcUiState.isNeedStartPosition : false, (3969 & 1024) != 0 ? interactionWithNpcUiState.isNeedClose : false, (3969 & 2048) != 0 ? interactionWithNpcUiState.isBlockingLoading : false)));
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C41552(json, this, null), 1, null);
    }

    /* compiled from: InteractionWithNpcViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel$initJson$2", m7120f = "InteractionWithNpcViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nInteractionWithNpcViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractionWithNpcViewModel.kt\ncom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel$initJson$2\n+ 2 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 3 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,143:1\n51#2,5:144\n56#2,11:158\n8#3,9:149\n230#4,5:169\n*S KotlinDebug\n*F\n+ 1 InteractionWithNpcViewModel.kt\ncom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel$initJson$2\n*L\n50#1:144,5\n50#1:158,11\n50#1:149,9\n55#1:169,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel$initJson$2 */
    /* loaded from: classes2.dex */
    public static final class C41552 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ InteractionWithNpcViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41552(JSONObject jSONObject, InteractionWithNpcViewModel interactionWithNpcViewModel, Continuation<? super C41552> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = interactionWithNpcViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C41552 c41552 = new C41552(this.$json, this.this$0, continuation);
            c41552.L$0 = obj;
            return c41552;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41552) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ArrayList arrayList;
            Object objFromJson;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            String strOptString = this.$json.optString("n", AnyExtensionKt.empty(coroutineScope));
            String strOptString2 = this.$json.optString("d", AnyExtensionKt.empty(coroutineScope));
            int iOptInt = this.$json.optInt("m", -1);
            JSONArray jSONArrayOptJSONArray = this.$json.optJSONArray("b");
            if (jSONArrayOptJSONArray != null) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                        Intrinsics.checkNotNull(jSONObject);
                        try {
                            Gson gson = new Gson();
                            String string = jSONObject.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) InteractionWithNpcButtonModel.class);
                        } catch (Exception e) {
                            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                            firebaseCrashlytics.log(e.toString());
                            firebaseCrashlytics.recordException(e);
                            objFromJson = null;
                        }
                        if (objFromJson != null) {
                            Boxing.boxBoolean(arrayList2.add(objFromJson));
                        }
                    }
                    arrayList = arrayList2;
                } catch (Exception e2) {
                    FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                    firebaseCrashlytics2.log(e2.toString());
                    firebaseCrashlytics2.recordException(e2);
                }
            } else {
                arrayList = null;
            }
            long jOptInt = this.$json.optInt("ts");
            boolean zIsOne = IntExtensionKt.isOne(Boxing.boxInt(this.$json.optInt("st")));
            MutableStateFlow<InteractionWithNpcUiState> mutableStateFlow = this.this$0.get_uiState();
            while (true) {
                InteractionWithNpcUiState value = mutableStateFlow.getValue();
                InteractionWithNpcUiState interactionWithNpcUiState = value;
                Intrinsics.checkNotNull(strOptString);
                Intrinsics.checkNotNull(strOptString2);
                MutableStateFlow<InteractionWithNpcUiState> mutableStateFlow2 = mutableStateFlow;
                long j = jOptInt;
                if (mutableStateFlow2.compareAndSet(value, interactionWithNpcUiState.copy((3969 & 1) != 0 ? interactionWithNpcUiState.screen : 0, (3969 & 2) != 0 ? interactionWithNpcUiState.textTitle : strOptString, (3969 & 4) != 0 ? interactionWithNpcUiState.textDesc : strOptString2, (3969 & 8) != 0 ? interactionWithNpcUiState.typingSpeed : jOptInt, (3969 & 16) != 0 ? interactionWithNpcUiState.isSkipText : zIsOne, (3969 & 32) != 0 ? interactionWithNpcUiState.buttonList : arrayList, (3969 & 64) != 0 ? interactionWithNpcUiState.renderId : iOptInt, (3969 & 128) != 0 ? interactionWithNpcUiState.bitmap : null, (3969 & 256) != 0 ? interactionWithNpcUiState.isRenderNew : false, (3969 & 512) != 0 ? interactionWithNpcUiState.isNeedStartPosition : false, (3969 & 1024) != 0 ? interactionWithNpcUiState.isNeedClose : false, (3969 & 2048) != 0 ? interactionWithNpcUiState.isBlockingLoading : false))) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
                jOptInt = j;
            }
        }
    }

    /* compiled from: InteractionWithNpcViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel$updateJson$1", m7120f = "InteractionWithNpcViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nInteractionWithNpcViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractionWithNpcViewModel.kt\ncom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel$updateJson$1\n+ 2 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 3 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,143:1\n51#2,5:144\n56#2,11:158\n8#3,9:149\n230#4,5:169\n*S KotlinDebug\n*F\n+ 1 InteractionWithNpcViewModel.kt\ncom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel$updateJson$1\n*L\n76#1:144,5\n76#1:158,11\n76#1:149,9\n82#1:169,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel$updateJson$1 */
    /* loaded from: classes.dex */
    public static final class C41591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ InteractionWithNpcViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41591(JSONObject jSONObject, InteractionWithNpcViewModel interactionWithNpcViewModel, Continuation<? super C41591> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = interactionWithNpcViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C41591 c41591 = new C41591(this.$json, this.this$0, continuation);
            c41591.L$0 = obj;
            return c41591;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x011b A[LOOP:0: B:29:0x00e1->B:32:0x011b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x011f A[EDGE_INSN: B:41:0x011f->B:33:0x011f BREAK  A[LOOP:0: B:29:0x00e1->B:32:0x011b], SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ArrayList arrayList;
            Object objFromJson;
            boolean z;
            long jOptInt;
            boolean zIsOne;
            MutableStateFlow<InteractionWithNpcUiState> mutableStateFlow;
            InteractionWithNpcUiState value;
            InteractionWithNpcUiState interactionWithNpcUiState;
            MutableStateFlow<InteractionWithNpcUiState> mutableStateFlow2;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            if (this.$json.optInt("t") == 1) {
                String strOptString = this.$json.optString("n", AnyExtensionKt.empty(coroutineScope));
                String strOptString2 = this.$json.optString("d", AnyExtensionKt.empty(coroutineScope));
                int iOptInt = this.$json.optInt("m", -1);
                JSONArray jSONArrayOptJSONArray = this.$json.optJSONArray("b");
                if (jSONArrayOptJSONArray == null) {
                    arrayList = null;
                    if (iOptInt != this.this$0.get_uiState().getValue().getRenderId()) {
                    }
                    jOptInt = this.$json.optInt("ts");
                    zIsOne = IntExtensionKt.isOne(Boxing.boxInt(this.$json.optInt("st")));
                    mutableStateFlow = this.this$0.get_uiState();
                    while (true) {
                        value = mutableStateFlow.getValue();
                        interactionWithNpcUiState = value;
                        Intrinsics.checkNotNull(strOptString);
                        Intrinsics.checkNotNull(strOptString2);
                        mutableStateFlow2 = mutableStateFlow;
                        long j = jOptInt;
                        if (!mutableStateFlow2.compareAndSet(value, interactionWithNpcUiState.copy((3969 & 1) != 0 ? interactionWithNpcUiState.screen : 0, (3969 & 2) != 0 ? interactionWithNpcUiState.textTitle : strOptString, (3969 & 4) != 0 ? interactionWithNpcUiState.textDesc : strOptString2, (3969 & 8) != 0 ? interactionWithNpcUiState.typingSpeed : jOptInt, (3969 & 16) != 0 ? interactionWithNpcUiState.isSkipText : zIsOne, (3969 & 32) != 0 ? interactionWithNpcUiState.buttonList : arrayList, (3969 & 64) != 0 ? interactionWithNpcUiState.renderId : iOptInt, (3969 & 128) != 0 ? interactionWithNpcUiState.bitmap : null, (3969 & 256) != 0 ? interactionWithNpcUiState.isRenderNew : z, (3969 & 512) != 0 ? interactionWithNpcUiState.isNeedStartPosition : true, (3969 & 1024) != 0 ? interactionWithNpcUiState.isNeedClose : false, (3969 & 2048) != 0 ? interactionWithNpcUiState.isBlockingLoading : false))) {
                        }
                        mutableStateFlow = mutableStateFlow2;
                        jOptInt = j;
                    }
                } else {
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        int length = jSONArrayOptJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                            Intrinsics.checkNotNull(jSONObject);
                            try {
                                Gson gson = new Gson();
                                String string = jSONObject.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) InteractionWithNpcButtonModel.class);
                            } catch (Exception e) {
                                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                                firebaseCrashlytics.log(e.toString());
                                firebaseCrashlytics.recordException(e);
                                objFromJson = null;
                            }
                            if (objFromJson != null) {
                                Boxing.boxBoolean(arrayList2.add(objFromJson));
                            }
                        }
                        arrayList = arrayList2;
                    } catch (Exception e2) {
                        FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                        firebaseCrashlytics2.log(e2.toString());
                        firebaseCrashlytics2.recordException(e2);
                    }
                    z = iOptInt != this.this$0.get_uiState().getValue().getRenderId();
                    jOptInt = this.$json.optInt("ts");
                    zIsOne = IntExtensionKt.isOne(Boxing.boxInt(this.$json.optInt("st")));
                    mutableStateFlow = this.this$0.get_uiState();
                    while (true) {
                        value = mutableStateFlow.getValue();
                        interactionWithNpcUiState = value;
                        Intrinsics.checkNotNull(strOptString);
                        Intrinsics.checkNotNull(strOptString2);
                        mutableStateFlow2 = mutableStateFlow;
                        long j2 = jOptInt;
                        if (!mutableStateFlow2.compareAndSet(value, interactionWithNpcUiState.copy((3969 & 1) != 0 ? interactionWithNpcUiState.screen : 0, (3969 & 2) != 0 ? interactionWithNpcUiState.textTitle : strOptString, (3969 & 4) != 0 ? interactionWithNpcUiState.textDesc : strOptString2, (3969 & 8) != 0 ? interactionWithNpcUiState.typingSpeed : jOptInt, (3969 & 16) != 0 ? interactionWithNpcUiState.isSkipText : zIsOne, (3969 & 32) != 0 ? interactionWithNpcUiState.buttonList : arrayList, (3969 & 64) != 0 ? interactionWithNpcUiState.renderId : iOptInt, (3969 & 128) != 0 ? interactionWithNpcUiState.bitmap : null, (3969 & 256) != 0 ? interactionWithNpcUiState.isRenderNew : z, (3969 & 512) != 0 ? interactionWithNpcUiState.isNeedStartPosition : true, (3969 & 1024) != 0 ? interactionWithNpcUiState.isNeedClose : false, (3969 & 2048) != 0 ? interactionWithNpcUiState.isBlockingLoading : false))) {
                            break;
                        }
                        mutableStateFlow = mutableStateFlow2;
                        jOptInt = j2;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C41591(json, this, null), 1, null);
    }

    /* compiled from: InteractionWithNpcViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel$sendButtonClick$1", m7120f = "InteractionWithNpcViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel$sendButtonClick$1 */
    /* loaded from: classes.dex */
    public static final class C41561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $buttonKey;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41561(int i, Continuation<? super C41561> continuation) {
            super(2, continuation);
            this.$buttonKey = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InteractionWithNpcViewModel.this.new C41561(this.$buttonKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                InteractionWithNpcViewModel.this.actionWithJSON.sendButtonClick(this.$buttonKey);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendButtonClick(int buttonKey) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C41561(buttonKey, null), 1, null);
    }

    /* compiled from: InteractionWithNpcViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel$sendCloseScreen$1", m7120f = "InteractionWithNpcViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nInteractionWithNpcViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractionWithNpcViewModel.kt\ncom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,143:1\n230#2,5:144\n*S KotlinDebug\n*F\n+ 1 InteractionWithNpcViewModel.kt\ncom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel$sendCloseScreen$1\n*L\n107#1:144,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel$sendCloseScreen$1 */
    /* loaded from: classes.dex */
    public static final class C41571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $screen;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41571(int i, Continuation<? super C41571> continuation) {
            super(2, continuation);
            this.$screen = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InteractionWithNpcViewModel.this.new C41571(this.$screen, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            InteractionWithNpcUiState value;
            InteractionWithNpcUiState interactionWithNpcUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                InteractionWithNpcViewModel.this.actionWithJSON.sendCloseScreen(this.$screen);
                MutableStateFlow<InteractionWithNpcUiState> mutableStateFlow = InteractionWithNpcViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    interactionWithNpcUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, interactionWithNpcUiState.copy((3969 & 1) != 0 ? interactionWithNpcUiState.screen : 0, (3969 & 2) != 0 ? interactionWithNpcUiState.textTitle : null, (3969 & 4) != 0 ? interactionWithNpcUiState.textDesc : null, (3969 & 8) != 0 ? interactionWithNpcUiState.typingSpeed : 0L, (3969 & 16) != 0 ? interactionWithNpcUiState.isSkipText : false, (3969 & 32) != 0 ? interactionWithNpcUiState.buttonList : null, (3969 & 64) != 0 ? interactionWithNpcUiState.renderId : 0, (3969 & 128) != 0 ? interactionWithNpcUiState.bitmap : null, (3969 & 256) != 0 ? interactionWithNpcUiState.isRenderNew : false, (3969 & 512) != 0 ? interactionWithNpcUiState.isNeedStartPosition : false, (3969 & 1024) != 0 ? interactionWithNpcUiState.isNeedClose : true, (3969 & 2048) != 0 ? interactionWithNpcUiState.isBlockingLoading : false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendCloseScreen(int screen) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C41571(screen, null), 1, null);
    }

    /* compiled from: InteractionWithNpcViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel$setRender$1", m7120f = "InteractionWithNpcViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nInteractionWithNpcViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractionWithNpcViewModel.kt\ncom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel$setRender$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,143:1\n230#2,5:144\n*S KotlinDebug\n*F\n+ 1 InteractionWithNpcViewModel.kt\ncom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcViewModel$setRender$1\n*L\n128#1:144,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel$setRender$1 */
    /* loaded from: classes.dex */
    public static final class C41581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $renderId;
        public final /* synthetic */ int $widthSwScreen;
        public int label;
        public final /* synthetic */ InteractionWithNpcViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41581(int i, int i2, InteractionWithNpcViewModel interactionWithNpcViewModel, Continuation<? super C41581> continuation) {
            super(2, continuation);
            this.$renderId = i;
            this.$widthSwScreen = i2;
            this.this$0 = interactionWithNpcViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C41581(this.$renderId, this.$widthSwScreen, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GameRender gameRender = GameRender.getInstance();
            int i = this.$renderId;
            int i2 = this.$widthSwScreen;
            final InteractionWithNpcViewModel interactionWithNpcViewModel = this.this$0;
            gameRender.RequestRenderWithSize(2, 1, i, 0, 0, 0.0f, 180.0f, 0.0f, 1.0f, i2, i2 * 2, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel$setRender$1$$ExternalSyntheticLambda0
                @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                public final void OnRenderComplete(int i3, Bitmap bitmap) {
                    InteractionWithNpcViewModel.C41581.invokeSuspend$lambda$1(interactionWithNpcViewModel, i3, bitmap);
                }
            });
            return Unit.INSTANCE;
        }

        public static final void invokeSuspend$lambda$1(InteractionWithNpcViewModel interactionWithNpcViewModel, int i, Bitmap bitmap) {
            InteractionWithNpcUiState value;
            InteractionWithNpcUiState interactionWithNpcUiState;
            MutableStateFlow<InteractionWithNpcUiState> mutableStateFlow = interactionWithNpcViewModel.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                interactionWithNpcUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, interactionWithNpcUiState.copy((3969 & 1) != 0 ? interactionWithNpcUiState.screen : 0, (3969 & 2) != 0 ? interactionWithNpcUiState.textTitle : null, (3969 & 4) != 0 ? interactionWithNpcUiState.textDesc : null, (3969 & 8) != 0 ? interactionWithNpcUiState.typingSpeed : 0L, (3969 & 16) != 0 ? interactionWithNpcUiState.isSkipText : false, (3969 & 32) != 0 ? interactionWithNpcUiState.buttonList : null, (3969 & 64) != 0 ? interactionWithNpcUiState.renderId : 0, (3969 & 128) != 0 ? interactionWithNpcUiState.bitmap : bitmap, (3969 & 256) != 0 ? interactionWithNpcUiState.isRenderNew : false, (3969 & 512) != 0 ? interactionWithNpcUiState.isNeedStartPosition : false, (3969 & 1024) != 0 ? interactionWithNpcUiState.isNeedClose : false, (3969 & 2048) != 0 ? interactionWithNpcUiState.isBlockingLoading : false)));
        }
    }

    public final void setRender(int widthSwScreen, int renderId) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C41581(renderId, widthSwScreen, this, null), 1, null);
    }

    public final void clearScrollPosition() {
        InteractionWithNpcUiState value;
        InteractionWithNpcUiState interactionWithNpcUiState;
        MutableStateFlow<InteractionWithNpcUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            interactionWithNpcUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, interactionWithNpcUiState.copy((3969 & 1) != 0 ? interactionWithNpcUiState.screen : 0, (3969 & 2) != 0 ? interactionWithNpcUiState.textTitle : null, (3969 & 4) != 0 ? interactionWithNpcUiState.textDesc : null, (3969 & 8) != 0 ? interactionWithNpcUiState.typingSpeed : 0L, (3969 & 16) != 0 ? interactionWithNpcUiState.isSkipText : false, (3969 & 32) != 0 ? interactionWithNpcUiState.buttonList : null, (3969 & 64) != 0 ? interactionWithNpcUiState.renderId : 0, (3969 & 128) != 0 ? interactionWithNpcUiState.bitmap : null, (3969 & 256) != 0 ? interactionWithNpcUiState.isRenderNew : false, (3969 & 512) != 0 ? interactionWithNpcUiState.isNeedStartPosition : false, (3969 & 1024) != 0 ? interactionWithNpcUiState.isNeedClose : false, (3969 & 2048) != 0 ? interactionWithNpcUiState.isBlockingLoading : false)));
    }
}
