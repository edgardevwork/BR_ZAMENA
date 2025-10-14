package io.ktor.client.plugins.json;

import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.utils.EmptyContent;
import io.ktor.http.ContentType;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.pipeline.PipelineContext;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JsonPlugin.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "payload"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.client.plugins.json.JsonPlugin$Plugin$install$1", m7120f = "JsonPlugin.kt", m7121i = {}, m7122l = {211}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
@SourceDebugExtension({"SMAP\nJsonPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonPlugin.kt\nio/ktor/client/plugins/json/JsonPlugin$Plugin$install$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,236:1\n1855#2,2:237\n*S KotlinDebug\n*F\n+ 1 JsonPlugin.kt\nio/ktor/client/plugins/json/JsonPlugin$Plugin$install$1\n*L\n197#1:237,2\n*E\n"})
/* loaded from: classes6.dex */
public final class JsonPlugin$Plugin$install$1 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JsonPlugin $plugin;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonPlugin$Plugin$install$1(JsonPlugin jsonPlugin, Continuation<? super JsonPlugin$Plugin$install$1> continuation) {
        super(3, continuation);
        this.$plugin = jsonPlugin;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull PipelineContext<Object, HttpRequestBuilder> pipelineContext, @NotNull Object obj, @Nullable Continuation<? super Unit> continuation) {
        JsonPlugin$Plugin$install$1 jsonPlugin$Plugin$install$1 = new JsonPlugin$Plugin$install$1(this.$plugin, continuation);
        jsonPlugin$Plugin$install$1.L$0 = pipelineContext;
        jsonPlugin$Plugin$install$1.L$1 = obj;
        return jsonPlugin$Plugin$install$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        ContentType contentType;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PipelineContext pipelineContext = (PipelineContext) this.L$0;
            Object obj2 = this.L$1;
            Iterator<T> it = this.$plugin.getAcceptContentTypes().iterator();
            while (it.hasNext()) {
                UtilsKt.accept((HttpMessageBuilder) pipelineContext.getContext(), (ContentType) it.next());
            }
            if (!this.$plugin.ignoredTypes.contains(Reflection.getOrCreateKotlinClass(obj2.getClass())) && (contentType = HttpMessagePropertiesKt.contentType((HttpMessageBuilder) pipelineContext.getContext())) != null && this.$plugin.canHandle$ktor_client_json(contentType)) {
                ((HttpRequestBuilder) pipelineContext.getContext()).getHeaders().remove(HttpHeaders.INSTANCE.getContentType());
                OutgoingContent outgoingContentWrite = (Intrinsics.areEqual(obj2, Unit.INSTANCE) || (obj2 instanceof EmptyContent)) ? EmptyContent.INSTANCE : this.$plugin.getSerializer().write(obj2, contentType);
                this.L$0 = null;
                this.label = 1;
                if (pipelineContext.proceedWith(outgoingContentWrite, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
