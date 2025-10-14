package io.ktor.client.request;

import io.ktor.client.HttpClient;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.osgi.updatesite.xml.EclipseUpdateSiteParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: buildersWithUrl.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001a8\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a8\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a8\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a8\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a8\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a8\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a8\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a8\u0010\u0012\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a8\u0010\u0013\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a8\u0010\u0014\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a8\u0010\u0015\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a8\u0010\u0016\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a8\u0010\u0017\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a8\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0012\u0010\u0003\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m7105d2 = {"delete", "Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/HttpClient;", "url", "Lio/ktor/http/Url;", "block", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lio/ktor/client/HttpClient;Lio/ktor/http/Url;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "head", "options", EclipseUpdateSiteParser.FeatureHandler.PATCH, "post", "prepareDelete", "Lio/ktor/client/statement/HttpStatement;", "prepareGet", "prepareHead", "prepareOptions", "preparePatch", "preparePost", "preparePut", "put", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nbuildersWithUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 buildersWithUrl.kt\nio/ktor/client/request/BuildersWithUrlKt\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n*L\n1#1,199:1\n225#2:200\n99#2,2:201\n22#2:203\n99#2,2:204\n22#2:206\n99#2,2:207\n22#2:209\n279#2:210\n167#2,2:211\n29#2:213\n279#2:214\n167#2,2:215\n29#2:217\n279#2:218\n167#2,2:219\n29#2:221\n233#2:222\n109#2,2:223\n22#2:225\n233#2:226\n109#2,2:227\n22#2:229\n233#2:230\n109#2,2:231\n22#2:233\n285#2:234\n175#2,2:235\n29#2:237\n285#2:238\n175#2,2:239\n29#2:241\n285#2:242\n175#2,2:243\n29#2:245\n241#2:246\n119#2,2:247\n22#2:249\n241#2:250\n119#2,2:251\n22#2:253\n241#2:254\n119#2,2:255\n22#2:257\n291#2:258\n183#2,2:259\n29#2:261\n291#2:262\n183#2,2:263\n29#2:265\n291#2:266\n183#2,2:267\n29#2:269\n265#2:270\n149#2,2:271\n22#2:273\n265#2:274\n149#2,2:275\n22#2:277\n265#2:278\n149#2,2:279\n22#2:281\n309#2:282\n207#2,2:283\n29#2:285\n309#2:286\n207#2,2:287\n29#2:289\n309#2:290\n207#2,2:291\n29#2:293\n257#2:294\n139#2,2:295\n22#2:297\n257#2:298\n139#2,2:299\n22#2:301\n257#2:302\n139#2,2:303\n22#2:305\n303#2:306\n199#2,2:307\n29#2:309\n303#2:310\n199#2,2:311\n29#2:313\n303#2:314\n199#2,2:315\n29#2:317\n273#2:318\n159#2,2:319\n22#2:321\n273#2:322\n159#2,2:323\n22#2:325\n273#2:326\n159#2,2:327\n22#2:329\n315#2:330\n215#2,2:331\n29#2:333\n315#2:334\n215#2,2:335\n29#2:337\n315#2:338\n215#2,2:339\n29#2:341\n249#2:342\n129#2,2:343\n22#2:345\n249#2:346\n129#2,2:347\n22#2:349\n249#2:350\n129#2,2:351\n22#2:353\n297#2:354\n191#2,2:355\n29#2:357\n297#2:358\n191#2,2:359\n29#2:361\n297#2:362\n191#2,2:363\n29#2:365\n*S KotlinDebug\n*F\n+ 1 buildersWithUrl.kt\nio/ktor/client/request/BuildersWithUrlKt\n*L\n20#1:200\n20#1:201,2\n20#1:203\n20#1:204,2\n20#1:206\n20#1:207,2\n20#1:209\n32#1:210\n32#1:211,2\n32#1:213\n32#1:214\n32#1:215,2\n32#1:217\n32#1:218\n32#1:219,2\n32#1:221\n46#1:222\n46#1:223,2\n46#1:225\n46#1:226\n46#1:227,2\n46#1:229\n46#1:230\n46#1:231,2\n46#1:233\n58#1:234\n58#1:235,2\n58#1:237\n58#1:238\n58#1:239,2\n58#1:241\n58#1:242\n58#1:243,2\n58#1:245\n72#1:246\n72#1:247,2\n72#1:249\n72#1:250\n72#1:251,2\n72#1:253\n72#1:254\n72#1:255,2\n72#1:257\n84#1:258\n84#1:259,2\n84#1:261\n84#1:262\n84#1:263,2\n84#1:265\n84#1:266\n84#1:267,2\n84#1:269\n98#1:270\n98#1:271,2\n98#1:273\n98#1:274\n98#1:275,2\n98#1:277\n98#1:278\n98#1:279,2\n98#1:281\n110#1:282\n110#1:283,2\n110#1:285\n110#1:286\n110#1:287,2\n110#1:289\n110#1:290\n110#1:291,2\n110#1:293\n124#1:294\n124#1:295,2\n124#1:297\n124#1:298\n124#1:299,2\n124#1:301\n124#1:302\n124#1:303,2\n124#1:305\n136#1:306\n136#1:307,2\n136#1:309\n136#1:310\n136#1:311,2\n136#1:313\n136#1:314\n136#1:315,2\n136#1:317\n150#1:318\n150#1:319,2\n150#1:321\n150#1:322\n150#1:323,2\n150#1:325\n150#1:326\n150#1:327,2\n150#1:329\n162#1:330\n162#1:331,2\n162#1:333\n162#1:334\n162#1:335,2\n162#1:337\n162#1:338\n162#1:339,2\n162#1:341\n176#1:342\n176#1:343,2\n176#1:345\n176#1:346\n176#1:347,2\n176#1:349\n176#1:350\n176#1:351,2\n176#1:353\n188#1:354\n188#1:355,2\n188#1:357\n188#1:358\n188#1:359,2\n188#1:361\n188#1:362\n188#1:363,2\n188#1:365\n*E\n"})
/* loaded from: classes4.dex */
public final class BuildersWithUrlKt {
    public static /* synthetic */ Object get$default(HttpClient httpClient, Url url, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt.get.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object prepareGet$default(HttpClient httpClient, Url url, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt.prepareGet.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object post$default(HttpClient httpClient, Url url, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt.post.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object preparePost$default(HttpClient httpClient, Url url, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt.preparePost.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object put$default(HttpClient httpClient, Url url, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt.put.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object preparePut$default(HttpClient httpClient, Url url, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt.preparePut.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object patch$default(HttpClient httpClient, Url url, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt.patch.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object preparePatch$default(HttpClient httpClient, Url url, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt.preparePatch.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object options$default(HttpClient httpClient, Url url, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt.options.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object prepareOptions$default(HttpClient httpClient, Url url, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt.prepareOptions.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object head$default(HttpClient httpClient, Url url, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt.head.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object prepareHead$default(HttpClient httpClient, Url url, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt.prepareHead.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object delete$default(HttpClient httpClient, Url url, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt.delete.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object prepareDelete$default(HttpClient httpClient, Url url, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt.prepareDelete.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HttpRequestBuilder httpRequestBuilder) {
                    Intrinsics.checkNotNullParameter(httpRequestBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final void url(@NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Url url) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
    }

    @Nullable
    public static final Object get(@NotNull HttpClient httpClient, @NotNull Url url, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object get$$forInline(HttpClient httpClient, Url url, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object prepareGet(@NotNull HttpClient httpClient, @NotNull Url url, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareGet$$forInline(HttpClient httpClient, Url url, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object post(@NotNull HttpClient httpClient, @NotNull Url url, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object post$$forInline(HttpClient httpClient, Url url, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object preparePost(@NotNull HttpClient httpClient, @NotNull Url url, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object preparePost$$forInline(HttpClient httpClient, Url url, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object put(@NotNull HttpClient httpClient, @NotNull Url url, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object put$$forInline(HttpClient httpClient, Url url, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object preparePut(@NotNull HttpClient httpClient, @NotNull Url url, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object preparePut$$forInline(HttpClient httpClient, Url url, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object patch(@NotNull HttpClient httpClient, @NotNull Url url, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object patch$$forInline(HttpClient httpClient, Url url, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object preparePatch(@NotNull HttpClient httpClient, @NotNull Url url, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object preparePatch$$forInline(HttpClient httpClient, Url url, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object options(@NotNull HttpClient httpClient, @NotNull Url url, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object options$$forInline(HttpClient httpClient, Url url, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object prepareOptions(@NotNull HttpClient httpClient, @NotNull Url url, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareOptions$$forInline(HttpClient httpClient, Url url, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object head(@NotNull HttpClient httpClient, @NotNull Url url, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object head$$forInline(HttpClient httpClient, Url url, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object prepareHead(@NotNull HttpClient httpClient, @NotNull Url url, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareHead$$forInline(HttpClient httpClient, Url url, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object delete(@NotNull HttpClient httpClient, @NotNull Url url, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object delete$$forInline(HttpClient httpClient, Url url, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object prepareDelete(@NotNull HttpClient httpClient, @NotNull Url url, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareDelete$$forInline(HttpClient httpClient, Url url, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }
}
