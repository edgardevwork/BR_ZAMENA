package com.blackhub.bronline.game.gui.chat;

import android.text.SpannedString;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.chat.model.ChatMessageModel;
import com.blackhub.bronline.game.gui.chat.model.ChatMessageServerModel;
import com.blackhub.bronline.game.gui.chat.network.ChatActionsWithJson;
import com.bless.client.R;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
import org.json.JSONObject;

/* compiled from: ChatViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0006\u0010\u001d\u001a\u00020\u0013J\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/chat/ChatViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/chat/ChatUiState;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "actionsWithJson", "Lcom/blackhub/bronline/game/gui/chat/network/ChatActionsWithJson;", "(Lcom/blackhub/bronline/game/core/resources/StringResource;Lcom/blackhub/bronline/game/gui/chat/network/ChatActionsWithJson;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initJson", "", "json", "Lorg/json/JSONObject;", "onButtonSendClick", "text", "", "parseMessageItem", "Lcom/blackhub/bronline/game/gui/chat/model/ChatMessageModel;", "serverMessageModel", "Lcom/blackhub/bronline/game/gui/chat/model/ChatMessageServerModel;", "sendOnVoteClick", "updateJson", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nChatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatViewModel.kt\ncom/blackhub/bronline/game/gui/chat/ChatViewModel\n+ 2 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n*L\n1#1,109:1\n28#2:110\n*S KotlinDebug\n*F\n+ 1 ChatViewModel.kt\ncom/blackhub/bronline/game/gui/chat/ChatViewModel\n*L\n98#1:110\n*E\n"})
/* loaded from: classes3.dex */
public final class ChatViewModel extends BaseViewModel<ChatUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<ChatUiState> _uiState;

    @NotNull
    public final ChatActionsWithJson actionsWithJson;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<ChatUiState> uiState;

    /* compiled from: ChatViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatMessageTypeEnum.values().length];
            try {
                iArr[ChatMessageTypeEnum.ENEMY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatMessageTypeEnum.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChatMessageTypeEnum.MINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public ChatViewModel(@NotNull StringResource stringResource, @NotNull ChatActionsWithJson actionsWithJson) {
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(actionsWithJson, "actionsWithJson");
        this.stringResource = stringResource;
        this.actionsWithJson = actionsWithJson;
        this._uiState = StateFlowKt.MutableStateFlow(new ChatUiState(0, null, false, 7, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<ChatUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<ChatUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.chat.ChatViewModel$initJson$1", m7120f = "ChatViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nChatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatViewModel.kt\ncom/blackhub/bronline/game/gui/chat/ChatViewModel$initJson$1\n+ 2 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 3 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,109:1\n51#2,5:110\n56#2,11:124\n8#3,9:115\n1549#4:135\n1620#4,3:136\n230#5,5:139\n*S KotlinDebug\n*F\n+ 1 ChatViewModel.kt\ncom/blackhub/bronline/game/gui/chat/ChatViewModel$initJson$1\n*L\n38#1:110,5\n38#1:124,11\n38#1:115,9\n40#1:135\n40#1:136,3\n44#1:139,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.chat.ChatViewModel$initJson$1 */
    /* loaded from: classes.dex */
    public static final class C38231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ ChatViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38231(JSONObject jSONObject, ChatViewModel chatViewModel, Continuation<? super C38231> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = chatViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C38231(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ArrayList arrayList;
            Object objFromJson;
            ChatUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int iOptInt = this.$json.optInt(ChatKeys.TIMER_SECONDS_KEY);
            JSONArray jSONArrayOptJSONArray = this.$json.optJSONArray("tx");
            List listEmptyList = null;
            if (jSONArrayOptJSONArray != null) {
                try {
                    arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                        Intrinsics.checkNotNull(jSONObject);
                        try {
                            Gson gson = new Gson();
                            String string = jSONObject.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) ChatMessageServerModel.class);
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
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                ChatViewModel chatViewModel = this.this$0;
                listEmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    listEmptyList.add(chatViewModel.parseMessageItem((ChatMessageServerModel) it.next()));
                }
            }
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            List list = listEmptyList;
            MutableStateFlow<ChatUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, ChatUiState.copy$default(value, iOptInt, list, false, 4, null)));
            return Unit.INSTANCE;
        }
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38231(json, this, null), 1, null);
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.chat.ChatViewModel$updateJson$1", m7120f = "ChatViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nChatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatViewModel.kt\ncom/blackhub/bronline/game/gui/chat/ChatViewModel$updateJson$1\n+ 2 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 3 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,109:1\n51#2,5:110\n56#2,11:124\n8#3,9:115\n1855#4,2:135\n230#5,5:137\n*S KotlinDebug\n*F\n+ 1 ChatViewModel.kt\ncom/blackhub/bronline/game/gui/chat/ChatViewModel$updateJson$1\n*L\n59#1:110,5\n59#1:124,11\n59#1:115,9\n62#1:135,2\n68#1:137,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.chat.ChatViewModel$updateJson$1 */
    /* loaded from: classes.dex */
    public static final class C38261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ ChatViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38261(JSONObject jSONObject, ChatViewModel chatViewModel, Continuation<? super C38261> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = chatViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C38261(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objFromJson;
            ChatUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$json.optInt("t") == 2) {
                JSONArray jSONArrayOptJSONArray = this.$json.optJSONArray("tx");
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
                                objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) ChatMessageServerModel.class);
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
                }
                List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.this$0.getUiState().getValue().getMessagesList());
                if (arrayList != null) {
                    ChatViewModel chatViewModel = this.this$0;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        mutableList.add(chatViewModel.parseMessageItem((ChatMessageServerModel) it.next()));
                    }
                }
                MutableStateFlow<ChatUiState> mutableStateFlow = this.this$0.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, ChatUiState.copy$default(value, 0, mutableList, false, 5, null)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38261(json, this, null), 1, null);
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.chat.ChatViewModel$onButtonSendClick$1", m7120f = "ChatViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.chat.ChatViewModel$onButtonSendClick$1 */
    /* loaded from: classes.dex */
    public static final class C38241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $text;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38241(String str, Continuation<? super C38241> continuation) {
            super(2, continuation);
            this.$text = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ChatViewModel.this.new C38241(this.$text, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ChatViewModel.this.actionsWithJson.sendText(this.$text);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onButtonSendClick(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38241(text, null), 1, null);
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.chat.ChatViewModel$sendOnVoteClick$1", m7120f = "ChatViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.chat.ChatViewModel$sendOnVoteClick$1 */
    /* loaded from: classes.dex */
    public static final class C38251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38251(Continuation<? super C38251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ChatViewModel.this.new C38251(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ChatViewModel.this.actionsWithJson.sendOnVoteClick();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendOnVoteClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38251(null), 1, null);
    }

    public final ChatMessageModel parseMessageItem(ChatMessageServerModel serverMessageModel) {
        AnnotatedString annotatedStringHtmlTextToAnnotatedString;
        ChatMessageTypeEnum chatMessageTypeEnumFromInt = ChatMessageTypeEnum.INSTANCE.fromInt(serverMessageModel.getType());
        int i = WhenMappings.$EnumSwitchMapping$0[chatMessageTypeEnumFromInt.ordinal()];
        if (i == 1 || i == 2) {
            String name = serverMessageModel.getName();
            if (name == null) {
                name = "";
            }
            annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(name);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            annotatedStringHtmlTextToAnnotatedString = ComposeExtensionKt.toAnnotatedString(SpannedString.valueOf(getStringResource().getString(R.string.common_you)));
        }
        String message = serverMessageModel.getMessage();
        return new ChatMessageModel(annotatedStringHtmlTextToAnnotatedString, message != null ? message : "", chatMessageTypeEnumFromInt);
    }
}
