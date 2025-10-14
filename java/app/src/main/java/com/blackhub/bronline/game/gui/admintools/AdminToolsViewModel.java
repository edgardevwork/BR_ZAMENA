package com.blackhub.bronline.game.gui.admintools;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.core.constants.NativeConstants;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.admintools.model.ATPlayerInfoItemModel;
import com.blackhub.bronline.game.gui.admintools.model.ATTemplateModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdminToolsViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAdminToolsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 4 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n*L\n1#1,467:1\n230#2,5:468\n230#2,5:473\n230#2,5:478\n230#2,5:483\n51#3,5:488\n56#3,11:502\n8#4,9:493\n*S KotlinDebug\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel\n*L\n334#1:468,5\n424#1:473,5\n440#1:478,5\n449#1:483,5\n465#1:488,5\n465#1:502,11\n465#1:493,9\n*E\n"})
/* loaded from: classes3.dex */
public final class AdminToolsViewModel extends BaseViewModel<AdminToolsUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<AdminToolsUiState> _uiState;

    @NotNull
    public final AdminToolsActionWithJSON actionWithJSON;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<AdminToolsUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public AdminToolsViewModel(@NotNull AdminToolsActionWithJSON actionWithJSON, @NotNull StringResource stringResource) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        this.actionWithJSON = actionWithJSON;
        this.stringResource = stringResource;
        this._uiState = StateFlowKt.MutableStateFlow(new AdminToolsUiState(0, 0, null, null, null, null, null, null, 0, null, null, false, false, false, false, false, 65535, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<AdminToolsUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<AdminToolsUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: AdminToolsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$initJson$1", m7120f = "AdminToolsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nAdminToolsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$initJson$1\n+ 2 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 3 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,467:1\n51#2,5:468\n56#2,11:482\n8#3,9:473\n230#4,5:493\n230#4,5:498\n230#4,5:503\n*S KotlinDebug\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$initJson$1\n*L\n58#1:468,5\n58#1:482,11\n58#1:473,9\n60#1:493,5\n77#1:498,5\n90#1:503,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$initJson$1 */

    public static final class C36991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ AdminToolsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36991(JSONObject jSONObject, AdminToolsViewModel adminToolsViewModel, Continuation<? super C36991> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = adminToolsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C36991(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C36991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objFromJson;
            AdminToolsUiState value;
            AdminToolsUiState adminToolsUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int iOptInt = this.$json.optInt("t");
            if (IntExtensionKt.isNotZero(Boxing.boxInt(iOptInt))) {
                if (iOptInt == 1) {
                    int iOptInt2 = this.$json.optInt("id");
                    String strOptString = this.$json.optString("pn");
                    JSONArray jSONArrayOptJSONArray = this.$json.optJSONArray("pi");
                    List listEmptyList = null;
                    if (jSONArrayOptJSONArray != null) {
                        try {
                            ArrayList arrayList = new ArrayList();
                            int length = jSONArrayOptJSONArray.length();
                            for (int i = 0; i < length; i++) {
                                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                                Intrinsics.checkNotNull(jSONObject);
                                try {
                                    Gson gson = new Gson();
                                    String string = jSONObject.toString();
                                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                    objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) ATPlayerInfoItemModel.class);
                                } catch (Exception e) {
                                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                                    firebaseCrashlytics.log(e.toString());
                                    firebaseCrashlytics.recordException(e);
                                    objFromJson = null;
                                }
                                if (objFromJson != null) {
                                    Boxing.boxBoolean(arrayList.add(objFromJson));
                                }
                            }
                            listEmptyList = arrayList;
                        } catch (Exception e2) {
                            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                            firebaseCrashlytics2.log(e2.toString());
                            firebaseCrashlytics2.recordException(e2);
                        }
                    }
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    }
                    List list = listEmptyList;
                    MutableStateFlow<AdminToolsUiState> mutableStateFlow = this.this$0.get_uiState();
                    while (true) {
                        AdminToolsUiState value2 = mutableStateFlow.getValue();
                        AdminToolsUiState adminToolsUiState2 = value2;
                        Intrinsics.checkNotNull(strOptString);
                        MutableStateFlow<AdminToolsUiState> mutableStateFlow2 = mutableStateFlow;
                        if (mutableStateFlow2.compareAndSet(value2, adminToolsUiState2.copy((62398 & 1) != 0 ? adminToolsUiState2.screenType : iOptInt, (62398 & 2) != 0 ? adminToolsUiState2.playerId : iOptInt2, (62398 & 4) != 0 ? adminToolsUiState2.playerName : strOptString, (62398 & 8) != 0 ? adminToolsUiState2.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState2.playerInfoList : list, (62398 & 32) != 0 ? adminToolsUiState2.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState2.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState2.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState2.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState2.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState2.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState2.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState2.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState2.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState2.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState2.isBlockingLoading : false))) {
                            break;
                        }
                        mutableStateFlow = mutableStateFlow2;
                    }
                } else if (iOptInt == 3) {
                    JNILib.toggleDrawing2dStuff(true);
                    int iOptInt3 = this.$json.optInt("id");
                    String strOptString2 = this.$json.optString("pn");
                    String strOptString3 = this.$json.optString(AdminToolsKeys.ADMIN_TOOLS_PLAYER_TEXT_REPORT_KEY);
                    MutableStateFlow<AdminToolsUiState> mutableStateFlow3 = this.this$0.get_uiState();
                    while (true) {
                        AdminToolsUiState value3 = mutableStateFlow3.getValue();
                        AdminToolsUiState adminToolsUiState3 = value3;
                        Intrinsics.checkNotNull(strOptString2);
                        Intrinsics.checkNotNull(strOptString3);
                        int i2 = iOptInt;
                        if (mutableStateFlow3.compareAndSet(value3, adminToolsUiState3.copy((62398 & 1) != 0 ? adminToolsUiState3.screenType : iOptInt, (62398 & 2) != 0 ? adminToolsUiState3.playerId : iOptInt3, (62398 & 4) != 0 ? adminToolsUiState3.playerName : strOptString2, (62398 & 8) != 0 ? adminToolsUiState3.playerReport : strOptString3, (62398 & 16) != 0 ? adminToolsUiState3.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState3.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState3.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState3.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState3.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState3.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState3.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState3.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState3.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState3.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState3.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState3.isBlockingLoading : false))) {
                            break;
                        }
                        iOptInt = i2;
                    }
                } else if (iOptInt == 6) {
                    JNILib.toggleDrawing2dStuff(true);
                    MutableStateFlow<AdminToolsUiState> mutableStateFlow4 = this.this$0.get_uiState();
                    do {
                        value = mutableStateFlow4.getValue();
                        adminToolsUiState = value;
                    } while (!mutableStateFlow4.compareAndSet(value, adminToolsUiState.copy((62398 & 1) != 0 ? adminToolsUiState.screenType : iOptInt, (62398 & 2) != 0 ? adminToolsUiState.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState.playerName : null, (62398 & 8) != 0 ? adminToolsUiState.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState.isBlockingLoading : false)));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C36991(json, this, null), 1, null);
    }

    /* compiled from: AdminToolsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$updateJson$1", m7120f = "AdminToolsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nAdminToolsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$updateJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 4 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,467:1\n230#2,5:468\n230#2,5:473\n230#2,5:503\n230#2,5:508\n230#2,5:513\n230#2,5:519\n230#2,5:524\n230#2,5:529\n230#2,5:534\n230#2,5:539\n51#3,5:478\n56#3,11:492\n8#4,9:483\n1#5:518\n*S KotlinDebug\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$updateJson$1\n*L\n111#1:468,5\n119#1:473,5\n136#1:503,5\n150#1:508,5\n165#1:513,5\n186#1:519,5\n205#1:524,5\n219#1:529,5\n229#1:534,5\n241#1:539,5\n134#1:478,5\n134#1:492,11\n134#1:483,9\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$updateJson$1 */

    public static final class C37121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ AdminToolsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37121(JSONObject jSONObject, AdminToolsViewModel adminToolsViewModel, Continuation<? super C37121> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = adminToolsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C37121(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:114:0x046d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0429  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0469 A[LOOP:9: B:91:0x0434->B:94:0x0469, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            List arrayList;
            Object objFromJson;
            List list;
            MutableStateFlow<AdminToolsUiState> mutableStateFlow;
            AdminToolsUiState value;
            AdminToolsUiState adminToolsUiState;
            MutableStateFlow<AdminToolsUiState> mutableStateFlow2;
            AdminToolsUiState value2;
            AdminToolsUiState adminToolsUiState2;
            AdminToolsUiState value3;
            AdminToolsUiState adminToolsUiState3;
            AdminToolsUiState value4;
            AdminToolsUiState adminToolsUiState4;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int iOptInt = this.$json.optInt("t");
            boolean zIsNotZero = IntExtensionKt.isNotZero(Boxing.boxInt(this.$json.optInt(NativeConstants.ACTION_WITH_NATIVE_KEYBOARD)));
            boolean z = IntExtensionKt.isNotZero(Boxing.boxInt(iOptInt)) && this.this$0.get_uiState().getValue().isInterfaceVisible();
            int i = 9;
            if (zIsNotZero) {
                int iOptInt2 = this.$json.optInt(NativeConstants.ACTION_WITH_NATIVE_KEYBOARD);
                if (iOptInt2 == 1) {
                    MutableStateFlow<AdminToolsUiState> mutableStateFlow3 = this.this$0.get_uiState();
                    do {
                        value3 = mutableStateFlow3.getValue();
                        adminToolsUiState3 = value3;
                    } while (!mutableStateFlow3.compareAndSet(value3, adminToolsUiState3.copy((62398 & 1) != 0 ? adminToolsUiState3.screenType : 0, (62398 & 2) != 0 ? adminToolsUiState3.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState3.playerName : null, (62398 & 8) != 0 ? adminToolsUiState3.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState3.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState3.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState3.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState3.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState3.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState3.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState3.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState3.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState3.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState3.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState3.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState3.isBlockingLoading : false)));
                } else if (iOptInt2 == 9) {
                    MutableStateFlow<AdminToolsUiState> mutableStateFlow4 = this.this$0.get_uiState();
                    do {
                        value4 = mutableStateFlow4.getValue();
                        adminToolsUiState4 = value4;
                    } while (!mutableStateFlow4.compareAndSet(value4, adminToolsUiState4.copy((62398 & 1) != 0 ? adminToolsUiState4.screenType : 0, (62398 & 2) != 0 ? adminToolsUiState4.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState4.playerName : null, (62398 & 8) != 0 ? adminToolsUiState4.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState4.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState4.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState4.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState4.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState4.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState4.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState4.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState4.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState4.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState4.isInterfaceVisible : true, (62398 & 16384) != 0 ? adminToolsUiState4.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState4.isBlockingLoading : false)));
                }
            } else if (z) {
                String str = null;
                switch (iOptInt) {
                    case 1:
                        int iOptInt3 = this.$json.optInt("id");
                        String strOptString = this.$json.optString("pn");
                        JSONArray jSONArrayOptJSONArray = this.$json.optJSONArray("pi");
                        if (jSONArrayOptJSONArray == null) {
                            arrayList = null;
                            if (arrayList == null) {
                            }
                            list = arrayList;
                            mutableStateFlow = this.this$0.get_uiState();
                            while (true) {
                                value = mutableStateFlow.getValue();
                                adminToolsUiState = value;
                                Intrinsics.checkNotNull(strOptString);
                                mutableStateFlow2 = mutableStateFlow;
                                if (!mutableStateFlow2.compareAndSet(value, adminToolsUiState.copy((62398 & 1) != 0 ? adminToolsUiState.screenType : iOptInt, (62398 & 2) != 0 ? adminToolsUiState.playerId : iOptInt3, (62398 & 4) != 0 ? adminToolsUiState.playerName : strOptString, (62398 & 8) != 0 ? adminToolsUiState.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState.playerInfoList : list, (62398 & 32) != 0 ? adminToolsUiState.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState.isBlockingLoading : false))) {
                                }
                                mutableStateFlow = mutableStateFlow2;
                            }
                        } else {
                            try {
                                arrayList = new ArrayList();
                                int length = jSONArrayOptJSONArray.length();
                                for (int i2 = 0; i2 < length; i2++) {
                                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                                    Intrinsics.checkNotNull(jSONObject);
                                    try {
                                        Gson gson = new Gson();
                                        String string = jSONObject.toString();
                                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                        objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) ATPlayerInfoItemModel.class);
                                    } catch (Exception e) {
                                        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                                        firebaseCrashlytics.log(e.toString());
                                        firebaseCrashlytics.recordException(e);
                                        objFromJson = null;
                                    }
                                    if (objFromJson != null) {
                                        Boxing.boxBoolean(arrayList.add(objFromJson));
                                    }
                                }
                            } catch (Exception e2) {
                                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                                firebaseCrashlytics2.log(e2.toString());
                                firebaseCrashlytics2.recordException(e2);
                            }
                            if (arrayList == null) {
                                arrayList = CollectionsKt__CollectionsKt.emptyList();
                            }
                            list = arrayList;
                            mutableStateFlow = this.this$0.get_uiState();
                            while (true) {
                                value = mutableStateFlow.getValue();
                                adminToolsUiState = value;
                                Intrinsics.checkNotNull(strOptString);
                                mutableStateFlow2 = mutableStateFlow;
                                if (!mutableStateFlow2.compareAndSet(value, adminToolsUiState.copy((62398 & 1) != 0 ? adminToolsUiState.screenType : iOptInt, (62398 & 2) != 0 ? adminToolsUiState.playerId : iOptInt3, (62398 & 4) != 0 ? adminToolsUiState.playerName : strOptString, (62398 & 8) != 0 ? adminToolsUiState.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState.playerInfoList : list, (62398 & 32) != 0 ? adminToolsUiState.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState.isBlockingLoading : false))) {
                                    break;
                                } else {
                                    mutableStateFlow = mutableStateFlow2;
                                }
                            }
                        }
                    case 2:
                        List buttonsList = this.this$0.getButtonsList(this.$json);
                        MutableStateFlow<AdminToolsUiState> mutableStateFlow5 = this.this$0.get_uiState();
                        AdminToolsViewModel adminToolsViewModel = this.this$0;
                        while (true) {
                            AdminToolsUiState value5 = mutableStateFlow5.getValue();
                            AdminToolsUiState adminToolsUiState5 = value5;
                            AdminToolsViewModel adminToolsViewModel2 = adminToolsViewModel;
                            if (mutableStateFlow5.compareAndSet(value5, adminToolsUiState5.copy((62398 & 1) != 0 ? adminToolsUiState5.screenType : iOptInt, (62398 & 2) != 0 ? adminToolsUiState5.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState5.playerName : null, (62398 & 8) != 0 ? adminToolsUiState5.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState5.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState5.tableTitle : StringResource.adminToolsTableTitle$default(adminToolsViewModel.getStringResource(), iOptInt, adminToolsViewModel.getStringResource().getString(adminToolsViewModel.get_uiState().getValue().getCategory()), null, 0, 12, null), (62398 & 64) != 0 ? adminToolsUiState5.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState5.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState5.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState5.templateList : buttonsList, (62398 & 1024) != 0 ? adminToolsUiState5.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState5.isShowTable : true, (62398 & 4096) != 0 ? adminToolsUiState5.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState5.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState5.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState5.isBlockingLoading : false))) {
                                break;
                            } else {
                                adminToolsViewModel = adminToolsViewModel2;
                            }
                        }
                    case 3:
                        int i3 = iOptInt;
                        int iOptInt4 = this.$json.optInt("id");
                        String strOptString2 = this.$json.optString("pn");
                        String strOptString3 = this.$json.optString(AdminToolsKeys.ADMIN_TOOLS_PLAYER_TEXT_REPORT_KEY);
                        MutableStateFlow<AdminToolsUiState> mutableStateFlow6 = this.this$0.get_uiState();
                        while (true) {
                            AdminToolsUiState value6 = mutableStateFlow6.getValue();
                            AdminToolsUiState adminToolsUiState6 = value6;
                            Intrinsics.checkNotNull(strOptString2);
                            Intrinsics.checkNotNull(strOptString3);
                            MutableStateFlow<AdminToolsUiState> mutableStateFlow7 = mutableStateFlow6;
                            int i4 = i3;
                            if (mutableStateFlow7.compareAndSet(value6, adminToolsUiState6.copy((62398 & 1) != 0 ? adminToolsUiState6.screenType : i3, (62398 & 2) != 0 ? adminToolsUiState6.playerId : iOptInt4, (62398 & 4) != 0 ? adminToolsUiState6.playerName : strOptString2, (62398 & 8) != 0 ? adminToolsUiState6.playerReport : strOptString3, (62398 & 16) != 0 ? adminToolsUiState6.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState6.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState6.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState6.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState6.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState6.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState6.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState6.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState6.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState6.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState6.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState6.isBlockingLoading : false))) {
                                break;
                            } else {
                                mutableStateFlow6 = mutableStateFlow7;
                                i3 = i4;
                            }
                        }
                    case 4:
                        int i5 = iOptInt;
                        List buttonsList2 = this.this$0.getButtonsList(this.$json);
                        MutableStateFlow<AdminToolsUiState> mutableStateFlow8 = this.this$0.get_uiState();
                        AdminToolsViewModel adminToolsViewModel3 = this.this$0;
                        while (true) {
                            AdminToolsUiState value7 = mutableStateFlow8.getValue();
                            AdminToolsUiState adminToolsUiState7 = value7;
                            int i6 = i5;
                            AdminToolsViewModel adminToolsViewModel4 = adminToolsViewModel3;
                            String str2 = str;
                            if (mutableStateFlow8.compareAndSet(value7, adminToolsUiState7.copy((62398 & 1) != 0 ? adminToolsUiState7.screenType : i6, (62398 & 2) != 0 ? adminToolsUiState7.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState7.playerName : null, (62398 & 8) != 0 ? adminToolsUiState7.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState7.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState7.tableTitle : StringResource.adminToolsTableTitle$default(adminToolsViewModel3.getStringResource(), i5, null, adminToolsViewModel3.get_uiState().getValue().getPlayerName(), adminToolsViewModel3.get_uiState().getValue().getPlayerId(), 2, null), (62398 & 64) != 0 ? adminToolsUiState7.templateTitle : StringResource.adminToolsTemplateTitle$default(adminToolsViewModel3.getStringResource(), i6, str, 2, str), (62398 & 128) != 0 ? adminToolsUiState7.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState7.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState7.templateList : buttonsList2, (62398 & 1024) != 0 ? adminToolsUiState7.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState7.isShowTable : true, (62398 & 4096) != 0 ? adminToolsUiState7.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState7.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState7.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState7.isBlockingLoading : false))) {
                                break;
                            } else {
                                adminToolsViewModel3 = adminToolsViewModel4;
                                str = str2;
                                i5 = i6;
                            }
                        }
                    case 6:
                        List buttonsList3 = this.this$0.getButtonsList(this.$json);
                        MutableStateFlow<AdminToolsUiState> mutableStateFlow9 = this.this$0.get_uiState();
                        while (true) {
                            AdminToolsUiState value8 = mutableStateFlow9.getValue();
                            AdminToolsUiState adminToolsUiState8 = value8;
                            int i7 = iOptInt;
                            int i8 = iOptInt;
                            MutableStateFlow<AdminToolsUiState> mutableStateFlow10 = mutableStateFlow9;
                            if (mutableStateFlow10.compareAndSet(value8, adminToolsUiState8.copy((62398 & 1) != 0 ? adminToolsUiState8.screenType : i7, (62398 & 2) != 0 ? adminToolsUiState8.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState8.playerName : null, (62398 & 8) != 0 ? adminToolsUiState8.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState8.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState8.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState8.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState8.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState8.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState8.templateList : buttonsList3, (62398 & 1024) != 0 ? adminToolsUiState8.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState8.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState8.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState8.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState8.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState8.isBlockingLoading : false))) {
                                break;
                            } else {
                                mutableStateFlow9 = mutableStateFlow10;
                                iOptInt = i8;
                            }
                        }
                    case 7:
                        MutableStateFlow<AdminToolsUiState> mutableStateFlow11 = this.this$0.get_uiState();
                        do {
                            value2 = mutableStateFlow11.getValue();
                            adminToolsUiState2 = value2;
                        } while (!mutableStateFlow11.compareAndSet(value2, adminToolsUiState2.copy((62398 & 1) != 0 ? adminToolsUiState2.screenType : iOptInt, (62398 & 2) != 0 ? adminToolsUiState2.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState2.playerName : null, (62398 & 8) != 0 ? adminToolsUiState2.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState2.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState2.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState2.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState2.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState2.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState2.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState2.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState2.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState2.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState2.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState2.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState2.isBlockingLoading : false)));
                    case 8:
                        List buttonsList4 = this.this$0.getButtonsList(this.$json);
                        String string2 = IntExtensionKt.isNotZero(Boxing.boxInt(this.this$0.get_uiState().getValue().getCategoryId())) ? this.this$0.getStringResource().getString(this.this$0.get_uiState().getValue().getCategory()) : null;
                        MutableStateFlow<AdminToolsUiState> mutableStateFlow12 = this.this$0.get_uiState();
                        AdminToolsViewModel adminToolsViewModel5 = this.this$0;
                        while (true) {
                            AdminToolsUiState value9 = mutableStateFlow12.getValue();
                            AdminToolsUiState adminToolsUiState9 = value9;
                            AdminToolsViewModel adminToolsViewModel6 = adminToolsViewModel5;
                            MutableStateFlow<AdminToolsUiState> mutableStateFlow13 = mutableStateFlow12;
                            if (mutableStateFlow13.compareAndSet(value9, adminToolsUiState9.copy((62398 & 1) != 0 ? adminToolsUiState9.screenType : iOptInt, (62398 & 2) != 0 ? adminToolsUiState9.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState9.playerName : null, (62398 & 8) != 0 ? adminToolsUiState9.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState9.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState9.tableTitle : StringResource.adminToolsTableTitle$default(adminToolsViewModel5.getStringResource(), iOptInt, string2, null, 0, 12, null), (62398 & 64) != 0 ? adminToolsUiState9.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState9.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState9.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState9.templateList : buttonsList4, (62398 & 1024) != 0 ? adminToolsUiState9.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState9.isShowTable : true, (62398 & 4096) != 0 ? adminToolsUiState9.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState9.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState9.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState9.isBlockingLoading : false))) {
                                break;
                            } else {
                                mutableStateFlow12 = mutableStateFlow13;
                                adminToolsViewModel5 = adminToolsViewModel6;
                            }
                        }
                    case 9:
                        this.$json.optInt(AdminToolsKeys.ADMIN_TOOLS_TABLE_SHOW_TIME_FIELD_KEY);
                        String string3 = this.this$0.getStringResource().getString(this.this$0.get_uiState().getValue().getCategory());
                        if (!IntExtensionKt.isNotZero(Boxing.boxInt(this.this$0.get_uiState().getValue().getCategoryId()))) {
                            string3 = null;
                        }
                        MutableStateFlow<AdminToolsUiState> mutableStateFlow14 = this.this$0.get_uiState();
                        AdminToolsViewModel adminToolsViewModel7 = this.this$0;
                        while (true) {
                            AdminToolsUiState value10 = mutableStateFlow14.getValue();
                            AdminToolsUiState adminToolsUiState10 = value10;
                            String strAdminToolsTemplateTitle = adminToolsViewModel7.getStringResource().adminToolsTemplateTitle(i, string3);
                            AdminToolsViewModel adminToolsViewModel8 = adminToolsViewModel7;
                            int i9 = i;
                            String str3 = string3;
                            MutableStateFlow<AdminToolsUiState> mutableStateFlow15 = mutableStateFlow14;
                            if (mutableStateFlow15.compareAndSet(value10, adminToolsUiState10.copy((62398 & 1) != 0 ? adminToolsUiState10.screenType : iOptInt, (62398 & 2) != 0 ? adminToolsUiState10.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState10.playerName : null, (62398 & 8) != 0 ? adminToolsUiState10.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState10.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState10.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState10.templateTitle : strAdminToolsTemplateTitle, (62398 & 128) != 0 ? adminToolsUiState10.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState10.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState10.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState10.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState10.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState10.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState10.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState10.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState10.isBlockingLoading : false))) {
                                break;
                            } else {
                                mutableStateFlow14 = mutableStateFlow15;
                                adminToolsViewModel7 = adminToolsViewModel8;
                                i = i9;
                                string3 = str3;
                            }
                        }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C37121(json, this, null), 1, null);
    }

    /* compiled from: AdminToolsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendTrackingPanelButton$1", m7120f = "AdminToolsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendTrackingPanelButton$1 */

    public static final class C37091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $buttonId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37091(int i, Continuation<? super C37091> continuation) {
            super(2, continuation);
            this.$buttonId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AdminToolsViewModel.this.new C37091(this.$buttonId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AdminToolsViewModel.this.actionWithJSON.sendButton(1, this.$buttonId);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendTrackingPanelButton(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37091(buttonId, null), 1, null);
    }

    /* compiled from: AdminToolsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendTrackingPanelCategoryButton$1", m7120f = "AdminToolsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nAdminToolsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$sendTrackingPanelCategoryButton$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,467:1\n230#2,5:468\n*S KotlinDebug\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$sendTrackingPanelCategoryButton$1\n*L\n266#1:468,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendTrackingPanelCategoryButton$1 */

    public static final class C37101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $buttonId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37101(int i, Continuation<? super C37101> continuation) {
            super(2, continuation);
            this.$buttonId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AdminToolsViewModel.this.new C37101(this.$buttonId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AdminToolsViewModel.this.actionWithJSON.sendButton(1, this.$buttonId);
                MutableStateFlow<AdminToolsUiState> mutableStateFlow = AdminToolsViewModel.this.get_uiState();
                int i = this.$buttonId;
                while (true) {
                    AdminToolsUiState value = mutableStateFlow.getValue();
                    AdminToolsUiState adminToolsUiState = value;
                    int i2 = i;
                    if (mutableStateFlow.compareAndSet(value, adminToolsUiState.copy((62398 & 1) != 0 ? adminToolsUiState.screenType : 0, (62398 & 2) != 0 ? adminToolsUiState.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState.playerName : null, (62398 & 8) != 0 ? adminToolsUiState.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState.categoryId : i, (62398 & 512) != 0 ? adminToolsUiState.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState.isBlockingLoading : false))) {
                        return Unit.INSTANCE;
                    }
                    i = i2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void sendTrackingPanelCategoryButton(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37101(buttonId, null), 1, null);
    }

    /* compiled from: AdminToolsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendReportButton$1", m7120f = "AdminToolsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendReportButton$1 */

    public static final class C37051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $buttonId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37051(int i, Continuation<? super C37051> continuation) {
            super(2, continuation);
            this.$buttonId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AdminToolsViewModel.this.new C37051(this.$buttonId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AdminToolsViewModel.this.actionWithJSON.sendButton(3, this.$buttonId);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendReportButton(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37051(buttonId, null), 1, null);
    }

    /* compiled from: AdminToolsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendReportCancelButton$1", m7120f = "AdminToolsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nAdminToolsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$sendReportCancelButton$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,467:1\n230#2,5:468\n*S KotlinDebug\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$sendReportCancelButton$1\n*L\n284#1:468,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendReportCancelButton$1 */

    public static final class C37061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $buttonId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37061(int i, Continuation<? super C37061> continuation) {
            super(2, continuation);
            this.$buttonId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AdminToolsViewModel.this.new C37061(this.$buttonId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            AdminToolsUiState value;
            AdminToolsUiState adminToolsUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AdminToolsViewModel.this.actionWithJSON.sendButton(3, this.$buttonId);
                AdminToolsViewModel.this.actionWithJSON.sendCloseScreen();
                MutableStateFlow<AdminToolsUiState> mutableStateFlow = AdminToolsViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    adminToolsUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, adminToolsUiState.copy((62398 & 1) != 0 ? adminToolsUiState.screenType : 0, (62398 & 2) != 0 ? adminToolsUiState.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState.playerName : null, (62398 & 8) != 0 ? adminToolsUiState.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState.isNeedClose : true, (62398 & 32768) != 0 ? adminToolsUiState.isBlockingLoading : false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendReportCancelButton(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37061(buttonId, null), 1, null);
    }

    /* compiled from: AdminToolsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendButtonId$1", m7120f = "AdminToolsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nAdminToolsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$sendButtonId$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,467:1\n230#2,5:468\n*S KotlinDebug\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$sendButtonId$1\n*L\n294#1:468,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendButtonId$1 */

    public static final class C37011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $buttonId;
        public final /* synthetic */ int $screenType;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37011(int i, int i2, Continuation<? super C37011> continuation) {
            super(2, continuation);
            this.$screenType = i;
            this.$buttonId = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AdminToolsViewModel.this.new C37011(this.$screenType, this.$buttonId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AdminToolsViewModel.this.actionWithJSON.sendButtonId(this.$screenType, this.$buttonId);
                int i = this.$screenType;
                if (i == 7 || i == 1) {
                    MutableStateFlow<AdminToolsUiState> mutableStateFlow = AdminToolsViewModel.this.get_uiState();
                    int i2 = this.$buttonId;
                    while (true) {
                        AdminToolsUiState value = mutableStateFlow.getValue();
                        AdminToolsUiState adminToolsUiState = value;
                        int i3 = i2;
                        if (mutableStateFlow.compareAndSet(value, adminToolsUiState.copy((62398 & 1) != 0 ? adminToolsUiState.screenType : 0, (62398 & 2) != 0 ? adminToolsUiState.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState.playerName : null, (62398 & 8) != 0 ? adminToolsUiState.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState.categoryId : i2, (62398 & 512) != 0 ? adminToolsUiState.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState.isBlockingLoading : false))) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendButtonId(int screenType, int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37011(screenType, buttonId, null), 1, null);
    }

    /* compiled from: AdminToolsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendButtonIdAndSetCategoryTitle$1", m7120f = "AdminToolsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nAdminToolsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$sendButtonIdAndSetCategoryTitle$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,467:1\n230#2,5:468\n230#2,5:473\n*S KotlinDebug\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$sendButtonIdAndSetCategoryTitle$1\n*L\n309#1:468,5\n317#1:473,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendButtonIdAndSetCategoryTitle$1 */

    public static final class C37021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $buttonId;
        public final /* synthetic */ String $categoryTitle;
        public final /* synthetic */ int $screenType;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37021(int i, int i2, String str, Continuation<? super C37021> continuation) {
            super(2, continuation);
            this.$screenType = i;
            this.$buttonId = i2;
            this.$categoryTitle = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AdminToolsViewModel.this.new C37021(this.$screenType, this.$buttonId, this.$categoryTitle, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AdminToolsViewModel.this.actionWithJSON.sendButtonId(this.$screenType, this.$buttonId);
                int i = this.$screenType;
                if (i == 1) {
                    MutableStateFlow<AdminToolsUiState> mutableStateFlow = AdminToolsViewModel.this.get_uiState();
                    int i2 = this.$buttonId;
                    while (true) {
                        AdminToolsUiState value = mutableStateFlow.getValue();
                        AdminToolsUiState adminToolsUiState = value;
                        int i3 = i2;
                        if (mutableStateFlow.compareAndSet(value, adminToolsUiState.copy((62398 & 1) != 0 ? adminToolsUiState.screenType : 0, (62398 & 2) != 0 ? adminToolsUiState.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState.playerName : null, (62398 & 8) != 0 ? adminToolsUiState.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState.categoryId : i2, (62398 & 512) != 0 ? adminToolsUiState.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState.isBlockingLoading : false))) {
                            break;
                        }
                        i2 = i3;
                    }
                } else if (i == 6) {
                    MutableStateFlow<AdminToolsUiState> mutableStateFlow2 = AdminToolsViewModel.this.get_uiState();
                    String str = this.$categoryTitle;
                    while (true) {
                        AdminToolsUiState value2 = mutableStateFlow2.getValue();
                        AdminToolsUiState adminToolsUiState2 = value2;
                        String str2 = str;
                        if (mutableStateFlow2.compareAndSet(value2, adminToolsUiState2.copy((62398 & 1) != 0 ? adminToolsUiState2.screenType : 0, (62398 & 2) != 0 ? adminToolsUiState2.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState2.playerName : null, (62398 & 8) != 0 ? adminToolsUiState2.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState2.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState2.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState2.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState2.categoryTitle : str, (62398 & 256) != 0 ? adminToolsUiState2.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState2.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState2.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState2.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState2.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState2.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState2.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState2.isBlockingLoading : false))) {
                            break;
                        }
                        str = str2;
                    }
                } else if (i == 7) {
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendButtonIdAndSetCategoryTitle(int screenType, int buttonId, @NotNull String categoryTitle) {
        Intrinsics.checkNotNullParameter(categoryTitle, "categoryTitle");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37021(screenType, buttonId, categoryTitle, null), 1, null);
    }

    /* compiled from: AdminToolsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendButton$1", m7120f = "AdminToolsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendButton$1 */

    public static final class C37001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $buttonId;
        public final /* synthetic */ int $screenType;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37001(int i, int i2, Continuation<? super C37001> continuation) {
            super(2, continuation);
            this.$screenType = i;
            this.$buttonId = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AdminToolsViewModel.this.new C37001(this.$screenType, this.$buttonId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AdminToolsViewModel.this.actionWithJSON.sendButton(this.$screenType, this.$buttonId);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendButton(int screenType, int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37001(screenType, buttonId, null), 1, null);
    }

    public final void selectTypeScreen(int screenType) {
        AdminToolsUiState value;
        AdminToolsUiState adminToolsUiState;
        MutableStateFlow<AdminToolsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            adminToolsUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, adminToolsUiState.copy((62398 & 1) != 0 ? adminToolsUiState.screenType : screenType, (62398 & 2) != 0 ? adminToolsUiState.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState.playerName : null, (62398 & 8) != 0 ? adminToolsUiState.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState.isBlockingLoading : false)));
    }

    /* compiled from: AdminToolsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendTemplateCreate$1", m7120f = "AdminToolsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nAdminToolsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$sendTemplateCreate$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,467:1\n230#2,5:468\n*S KotlinDebug\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$sendTemplateCreate$1\n*L\n348#1:468,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendTemplateCreate$1 */

    public static final class C37081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $templateDesc;
        public final /* synthetic */ Integer $templateTime;
        public final /* synthetic */ String $templateTitle;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37081(String str, String str2, Integer num, Continuation<? super C37081> continuation) {
            super(2, continuation);
            this.$templateTitle = str;
            this.$templateDesc = str2;
            this.$templateTime = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AdminToolsViewModel.this.new C37081(this.$templateTitle, this.$templateDesc, this.$templateTime, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            AdminToolsUiState value;
            AdminToolsUiState adminToolsUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdminToolsViewModel.this.actionWithJSON.sendTemplateCreate(this.$templateTitle, this.$templateDesc, this.$templateTime);
            MutableStateFlow<AdminToolsUiState> mutableStateFlow = AdminToolsViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                adminToolsUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, adminToolsUiState.copy((62398 & 1) != 0 ? adminToolsUiState.screenType : 6, (62398 & 2) != 0 ? adminToolsUiState.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState.playerName : null, (62398 & 8) != 0 ? adminToolsUiState.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState.isBlockingLoading : false)));
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void sendTemplateCreate$default(AdminToolsViewModel adminToolsViewModel, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        adminToolsViewModel.sendTemplateCreate(str, str2, num);
    }

    public final void sendTemplateCreate(@NotNull String templateTitle, @NotNull String templateDesc, @Nullable Integer templateTime) {
        Intrinsics.checkNotNullParameter(templateTitle, "templateTitle");
        Intrinsics.checkNotNullParameter(templateDesc, "templateDesc");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37081(templateTitle, templateDesc, templateTime, null), 1, null);
    }

    public static /* synthetic */ void sendTemplateEdit$default(AdminToolsViewModel adminToolsViewModel, int i, String str, String str2, Integer num, int i2, Object obj) throws JSONException {
        if ((i2 & 8) != 0) {
            num = null;
        }
        adminToolsViewModel.sendTemplateEdit(i, str, str2, num);
    }

    public final void sendTemplateEdit(int templateId, @NotNull String templateTitle, @NotNull String templateDesc, @Nullable Integer templateTime) throws JSONException {
        Intrinsics.checkNotNullParameter(templateTitle, "templateTitle");
        Intrinsics.checkNotNullParameter(templateDesc, "templateDesc");
        this.actionWithJSON.sendTemplateEdit(templateId, templateTitle, templateDesc, templateTime);
    }

    /* compiled from: AdminToolsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendTrackingPanelTableButtonAndCloseTable$1", m7120f = "AdminToolsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendTrackingPanelTableButtonAndCloseTable$1 */

    public static final class C37111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $buttonId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37111(int i, Continuation<? super C37111> continuation) {
            super(2, continuation);
            this.$buttonId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AdminToolsViewModel.this.new C37111(this.$buttonId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AdminToolsViewModel.this.actionWithJSON.sendTableButtonId(2, this.$buttonId);
                AdminToolsViewModel.this.closeTable();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendTrackingPanelTableButtonAndCloseTable(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37111(buttonId, null), 1, null);
    }

    /* compiled from: AdminToolsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendReportTableButton$1", m7120f = "AdminToolsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendReportTableButton$1 */

    public static final class C37071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $buttonId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37071(int i, Continuation<? super C37071> continuation) {
            super(2, continuation);
            this.$buttonId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AdminToolsViewModel.this.new C37071(this.$buttonId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AdminToolsViewModel.this.actionWithJSON.sendTableButtonId(4, this.$buttonId);
                AdminToolsViewModel.this.sendCloseScreen();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendReportTableButton(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37071(buttonId, null), 1, null);
    }

    /* compiled from: AdminToolsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$closeTableAndOpenTemplate$1", m7120f = "AdminToolsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nAdminToolsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$closeTableAndOpenTemplate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,467:1\n288#2,2:468\n230#3,5:470\n*S KotlinDebug\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$closeTableAndOpenTemplate$1\n*L\n386#1:468,2\n387#1:470,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$closeTableAndOpenTemplate$1 */

    public static final class C36971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $buttonId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36971(int i, Continuation<? super C36971> continuation) {
            super(2, continuation);
            this.$buttonId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AdminToolsViewModel.this.new C36971(this.$buttonId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C36971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object next;
            AdminToolsUiState value;
            AdminToolsUiState adminToolsUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<ATTemplateModel> templateList = AdminToolsViewModel.this.get_uiState().getValue().getTemplateList();
            int i = this.$buttonId;
            Iterator<T> it = templateList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ATTemplateModel) next).getTemplateId() == i) {
                    break;
                }
            }
            ATTemplateModel aTTemplateModel = (ATTemplateModel) next;
            MutableStateFlow<AdminToolsUiState> mutableStateFlow = AdminToolsViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                adminToolsUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, adminToolsUiState.copy((62398 & 1) != 0 ? adminToolsUiState.screenType : 32, (62398 & 2) != 0 ? adminToolsUiState.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState.playerName : null, (62398 & 8) != 0 ? adminToolsUiState.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState.currentTemplate : aTTemplateModel, (62398 & 2048) != 0 ? adminToolsUiState.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState.isBlockingLoading : false)));
            return Unit.INSTANCE;
        }
    }

    public final void closeTableAndOpenTemplate(int buttonId) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C36971(buttonId, null), 1, null);
    }

    /* compiled from: AdminToolsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$closeTableAndOpenEditTemplate$1", m7120f = "AdminToolsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nAdminToolsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$closeTableAndOpenEditTemplate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,467:1\n288#2,2:468\n1#3:470\n230#4,5:471\n*S KotlinDebug\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$closeTableAndOpenEditTemplate$1\n*L\n399#1:468,2\n402#1:471,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$closeTableAndOpenEditTemplate$1 */

    public static final class C36961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $buttonId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36961(int i, Continuation<? super C36961> continuation) {
            super(2, continuation);
            this.$buttonId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AdminToolsViewModel.this.new C36961(this.$buttonId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C36961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object next;
            AdminToolsUiState value;
            AdminToolsUiState adminToolsUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<ATTemplateModel> templateList = AdminToolsViewModel.this.get_uiState().getValue().getTemplateList();
            int i = this.$buttonId;
            Iterator<T> it = templateList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ATTemplateModel) next).getTemplateId() == i) {
                    break;
                }
            }
            ATTemplateModel aTTemplateModel = (ATTemplateModel) next;
            String string = IntExtensionKt.isNotZero(Boxing.boxInt(AdminToolsViewModel.this.get_uiState().getValue().getCategoryId())) ? AdminToolsViewModel.this.getStringResource().getString(AdminToolsViewModel.this.get_uiState().getValue().getCategory()) : null;
            MutableStateFlow<AdminToolsUiState> mutableStateFlow = AdminToolsViewModel.this.get_uiState();
            AdminToolsViewModel adminToolsViewModel = AdminToolsViewModel.this;
            do {
                value = mutableStateFlow.getValue();
                adminToolsUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, adminToolsUiState.copy((62398 & 1) != 0 ? adminToolsUiState.screenType : 82, (62398 & 2) != 0 ? adminToolsUiState.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState.playerName : null, (62398 & 8) != 0 ? adminToolsUiState.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState.templateTitle : adminToolsViewModel.getStringResource().adminToolsTemplateTitle(82, string), (62398 & 128) != 0 ? adminToolsUiState.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState.currentTemplate : aTTemplateModel, (62398 & 2048) != 0 ? adminToolsUiState.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState.isBlockingLoading : false)));
            return Unit.INSTANCE;
        }
    }

    public final void closeTableAndOpenEditTemplate(int buttonId) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C36961(buttonId, null), 1, null);
    }

    /* compiled from: AdminToolsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$deleteTemplateInTable$1", m7120f = "AdminToolsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$deleteTemplateInTable$1 */

    public static final class C36981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $buttonId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36981(int i, Continuation<? super C36981> continuation) {
            super(2, continuation);
            this.$buttonId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AdminToolsViewModel.this.new C36981(this.$buttonId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C36981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AdminToolsViewModel.this.actionWithJSON.sendTableButtonIdForRemove(this.$buttonId);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void deleteTemplateInTable(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C36981(buttonId, null), 1, null);
    }

    public final void closeReportTemplateAndOpenTable() {
        AdminToolsUiState value;
        AdminToolsUiState adminToolsUiState;
        MutableStateFlow<AdminToolsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            adminToolsUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, adminToolsUiState.copy((62398 & 1) != 0 ? adminToolsUiState.screenType : 3, (62398 & 2) != 0 ? adminToolsUiState.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState.playerName : null, (62398 & 8) != 0 ? adminToolsUiState.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState.isShowTable : true, (62398 & 4096) != 0 ? adminToolsUiState.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState.isBlockingLoading : false)));
    }

    /* compiled from: AdminToolsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendCustomReport$1", m7120f = "AdminToolsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendCustomReport$1 */

    public static final class C37041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $reportText;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37041(String str, Continuation<? super C37041> continuation) {
            super(2, continuation);
            this.$reportText = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AdminToolsViewModel.this.new C37041(this.$reportText, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AdminToolsViewModel.this.actionWithJSON.sendReport(this.$reportText);
                AdminToolsViewModel.this.sendCloseScreen();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendCustomReport(@NotNull String reportText) {
        Intrinsics.checkNotNullParameter(reportText, "reportText");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37041(reportText, null), 1, null);
    }

    public final void cancelConfirmationAndOpenTrackingPanel() {
        AdminToolsUiState value;
        AdminToolsUiState adminToolsUiState;
        MutableStateFlow<AdminToolsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            adminToolsUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, adminToolsUiState.copy((62398 & 1) != 0 ? adminToolsUiState.screenType : 1, (62398 & 2) != 0 ? adminToolsUiState.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState.playerName : null, (62398 & 8) != 0 ? adminToolsUiState.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState.isShowTable : true, (62398 & 4096) != 0 ? adminToolsUiState.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState.isBlockingLoading : false)));
    }

    public final void closeTable() {
        AdminToolsUiState value;
        AdminToolsUiState adminToolsUiState;
        MutableStateFlow<AdminToolsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            adminToolsUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, adminToolsUiState.copy((62398 & 1) != 0 ? adminToolsUiState.screenType : 0, (62398 & 2) != 0 ? adminToolsUiState.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState.playerName : null, (62398 & 8) != 0 ? adminToolsUiState.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState.isNeedClose : false, (62398 & 32768) != 0 ? adminToolsUiState.isBlockingLoading : false)));
    }

    /* compiled from: AdminToolsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendCloseScreen$1", m7120f = "AdminToolsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nAdminToolsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,467:1\n230#2,5:468\n*S KotlinDebug\n*F\n+ 1 AdminToolsViewModel.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsViewModel$sendCloseScreen$1\n*L\n457#1:468,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel$sendCloseScreen$1 */

    public static final class C37031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37031(Continuation<? super C37031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AdminToolsViewModel.this.new C37031(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            AdminToolsUiState value;
            AdminToolsUiState adminToolsUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AdminToolsViewModel.this.actionWithJSON.sendCloseScreen();
                MutableStateFlow<AdminToolsUiState> mutableStateFlow = AdminToolsViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    adminToolsUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, adminToolsUiState.copy((62398 & 1) != 0 ? adminToolsUiState.screenType : 0, (62398 & 2) != 0 ? adminToolsUiState.playerId : 0, (62398 & 4) != 0 ? adminToolsUiState.playerName : null, (62398 & 8) != 0 ? adminToolsUiState.playerReport : null, (62398 & 16) != 0 ? adminToolsUiState.playerInfoList : null, (62398 & 32) != 0 ? adminToolsUiState.tableTitle : null, (62398 & 64) != 0 ? adminToolsUiState.templateTitle : null, (62398 & 128) != 0 ? adminToolsUiState.categoryTitle : null, (62398 & 256) != 0 ? adminToolsUiState.categoryId : 0, (62398 & 512) != 0 ? adminToolsUiState.templateList : null, (62398 & 1024) != 0 ? adminToolsUiState.currentTemplate : null, (62398 & 2048) != 0 ? adminToolsUiState.isShowTable : false, (62398 & 4096) != 0 ? adminToolsUiState.isShowConfirmation : false, (62398 & 8192) != 0 ? adminToolsUiState.isInterfaceVisible : false, (62398 & 16384) != 0 ? adminToolsUiState.isNeedClose : true, (62398 & 32768) != 0 ? adminToolsUiState.isBlockingLoading : false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37031(null), 1, null);
    }

    public final List<ATTemplateModel> getButtonsList(JSONObject json) throws JSONException {
        Object objFromJson;
        JSONArray jSONArrayOptJSONArray = json.optJSONArray(AdminToolsKeys.ADMIN_TOOLS_BUTTONS_ARRAY_KEY);
        ArrayList arrayList = null;
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
                        objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) ATTemplateModel.class);
                    } catch (Exception e) {
                        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                        firebaseCrashlytics.log(e.toString());
                        firebaseCrashlytics.recordException(e);
                        objFromJson = null;
                    }
                    if (objFromJson != null) {
                        arrayList2.add(objFromJson);
                    }
                }
                arrayList = arrayList2;
            } catch (Exception e2) {
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                firebaseCrashlytics2.log(e2.toString());
                firebaseCrashlytics2.recordException(e2);
            }
        }
        return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }
}

