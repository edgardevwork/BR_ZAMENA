package io.ktor.client.request;

import io.ktor.client.HttpClient;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
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

/* compiled from: builders.kt */
@Metadata(m7104d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a.\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a8\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a.\u0010\u000f\u001a\u00020\u0007*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a8\u0010\u000f\u001a\u00020\u0007*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u001d\u0010\u0010\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a.\u0010\u0010\u001a\u00020\u0007*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a8\u0010\u0010\u001a\u00020\u0007*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u001d\u0010\u0011\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a.\u0010\u0011\u001a\u00020\u0007*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a8\u0010\u0011\u001a\u00020\u0007*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u001d\u0010\u0012\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a.\u0010\u0012\u001a\u00020\u0007*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a8\u0010\u0012\u001a\u00020\u0007*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u001d\u0010\u0013\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a.\u0010\u0013\u001a\u00020\u0007*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a8\u0010\u0013\u001a\u00020\u0007*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u001d\u0010\u0014\u001a\u00020\u0015*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a.\u0010\u0014\u001a\u00020\u0015*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a8\u0010\u0014\u001a\u00020\u0015*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u001d\u0010\u0016\u001a\u00020\u0015*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a.\u0010\u0016\u001a\u00020\u0015*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a8\u0010\u0016\u001a\u00020\u0015*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u001d\u0010\u0017\u001a\u00020\u0015*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a.\u0010\u0017\u001a\u00020\u0015*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a8\u0010\u0017\u001a\u00020\u0015*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u001d\u0010\u0018\u001a\u00020\u0015*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a.\u0010\u0018\u001a\u00020\u0015*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a8\u0010\u0018\u001a\u00020\u0015*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u001d\u0010\u0019\u001a\u00020\u0015*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a.\u0010\u0019\u001a\u00020\u0015*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a8\u0010\u0019\u001a\u00020\u0015*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u001d\u0010\u001a\u001a\u00020\u0015*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a.\u0010\u001a\u001a\u00020\u0015*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a8\u0010\u001a\u001a\u00020\u0015*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u001d\u0010\u001b\u001a\u00020\u0015*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a.\u0010\u001b\u001a\u00020\u0015*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a8\u0010\u001b\u001a\u00020\u0015*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u001f\u0010\u001c\u001a\u00020\u0015*\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a.\u0010\u001c\u001a\u00020\u0015*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a8\u0010\u001c\u001a\u00020\u0015*\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u001f\u001a8\u0010\u001c\u001a\u00020\u0015*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u001d\u0010 \u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a.\u0010 \u001a\u00020\u0007*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a8\u0010 \u001a\u00020\u0007*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u001f\u0010\u0000\u001a\u00020\u0007*\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a.\u0010\u0000\u001a\u00020\u0007*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a8\u0010\u0000\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u001f\u001a8\u0010\u0000\u001a\u00020\u0007*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m7105d2 = {"request", "Lio/ktor/client/request/HttpRequestBuilder;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "delete", "Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/HttpClient;", "builder", "(Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "urlString", "", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "head", "options", EclipseUpdateSiteParser.FeatureHandler.PATCH, "post", "prepareDelete", "Lio/ktor/client/statement/HttpStatement;", "prepareGet", "prepareHead", "prepareOptions", "preparePatch", "preparePost", "preparePut", "prepareRequest", "url", "Lio/ktor/http/Url;", "(Lio/ktor/client/HttpClient;Lio/ktor/http/Url;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "put", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nbuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 builders.kt\nio/ktor/client/request/BuildersKt\n*L\n1#1,462:1\n22#1:463\n29#1:464\n37#1:465\n22#1:466\n37#1:467\n22#1:468\n37#1:469\n22#1:470\n43#1:471\n29#1:472\n43#1:473\n29#1:474\n43#1:475\n29#1:476\n37#1:477\n22#1:478\n37#1:479\n22#1:480\n37#1:481\n22#1:482\n43#1:483\n29#1:484\n43#1:485\n29#1:486\n43#1:487\n29#1:488\n22#1:489\n22#1:490\n22#1:491\n22#1:492\n22#1:493\n22#1:494\n22#1:495\n29#1:496\n29#1:497\n29#1:498\n29#1:499\n29#1:500\n29#1:501\n29#1:502\n99#1,2:503\n22#1:505\n99#1,2:506\n22#1:508\n109#1,2:509\n22#1:511\n109#1,2:512\n22#1:514\n119#1,2:515\n22#1:517\n119#1,2:518\n22#1:520\n129#1,2:521\n22#1:523\n129#1,2:524\n22#1:526\n139#1,2:527\n22#1:529\n139#1,2:530\n22#1:532\n149#1,2:533\n22#1:535\n149#1,2:536\n22#1:538\n159#1,2:539\n22#1:541\n159#1,2:542\n22#1:544\n167#1,2:545\n29#1:547\n167#1,2:548\n29#1:550\n175#1,2:551\n29#1:553\n175#1,2:554\n29#1:556\n183#1,2:557\n29#1:559\n183#1,2:560\n29#1:562\n191#1,2:563\n29#1:565\n191#1,2:566\n29#1:568\n199#1,2:569\n29#1:571\n199#1,2:572\n29#1:574\n207#1,2:575\n29#1:577\n207#1,2:578\n29#1:580\n215#1,2:581\n29#1:583\n215#1,2:584\n29#1:586\n225#1:587\n99#1,2:588\n22#1:590\n225#1:591\n99#1,2:592\n22#1:594\n225#1:595\n99#1,2:596\n22#1:598\n233#1:599\n109#1,2:600\n22#1:602\n233#1:603\n109#1,2:604\n22#1:606\n233#1:607\n109#1,2:608\n22#1:610\n241#1:611\n119#1,2:612\n22#1:614\n241#1:615\n119#1,2:616\n22#1:618\n241#1:619\n119#1,2:620\n22#1:622\n249#1:623\n129#1,2:624\n22#1:626\n249#1:627\n129#1,2:628\n22#1:630\n249#1:631\n129#1,2:632\n22#1:634\n257#1:635\n139#1,2:636\n22#1:638\n257#1:639\n139#1,2:640\n22#1:642\n257#1:643\n139#1,2:644\n22#1:646\n265#1:647\n149#1,2:648\n22#1:650\n265#1:651\n149#1,2:652\n22#1:654\n265#1:655\n149#1,2:656\n22#1:658\n273#1:659\n159#1,2:660\n22#1:662\n273#1:663\n159#1,2:664\n22#1:666\n273#1:667\n159#1,2:668\n22#1:670\n279#1:671\n167#1,2:672\n29#1:674\n279#1:675\n167#1,2:676\n29#1:678\n279#1:679\n167#1,2:680\n29#1:682\n285#1:683\n175#1,2:684\n29#1:686\n285#1:687\n175#1,2:688\n29#1:690\n285#1:691\n175#1,2:692\n29#1:694\n291#1:695\n183#1,2:696\n29#1:698\n291#1:699\n183#1,2:700\n29#1:702\n291#1:703\n183#1,2:704\n29#1:706\n297#1:707\n191#1,2:708\n29#1:710\n297#1:711\n191#1,2:712\n29#1:714\n297#1:715\n191#1,2:716\n29#1:718\n303#1:719\n199#1,2:720\n29#1:722\n303#1:723\n199#1,2:724\n29#1:726\n303#1:727\n199#1,2:728\n29#1:730\n309#1:731\n207#1,2:732\n29#1:734\n309#1:735\n207#1,2:736\n29#1:738\n309#1:739\n207#1,2:740\n29#1:742\n315#1:743\n215#1,2:744\n29#1:746\n315#1:747\n215#1,2:748\n29#1:750\n315#1:751\n215#1,2:752\n29#1:754\n*S KotlinDebug\n*F\n+ 1 builders.kt\nio/ktor/client/request/BuildersKt\n*L\n37#1:463\n43#1:464\n53#1:465\n53#1:466\n53#1:467\n53#1:468\n53#1:469\n53#1:470\n64#1:471\n64#1:472\n64#1:473\n64#1:474\n64#1:475\n64#1:476\n77#1:477\n77#1:478\n77#1:479\n77#1:480\n77#1:481\n77#1:482\n88#1:483\n88#1:484\n88#1:485\n88#1:486\n88#1:487\n88#1:488\n100#1:489\n110#1:490\n120#1:491\n130#1:492\n140#1:493\n150#1:494\n160#1:495\n168#1:496\n176#1:497\n184#1:498\n192#1:499\n200#1:500\n208#1:501\n216#1:502\n225#1:503,2\n225#1:505\n225#1:506,2\n225#1:508\n233#1:509,2\n233#1:511\n233#1:512,2\n233#1:514\n241#1:515,2\n241#1:517\n241#1:518,2\n241#1:520\n249#1:521,2\n249#1:523\n249#1:524,2\n249#1:526\n257#1:527,2\n257#1:529\n257#1:530,2\n257#1:532\n265#1:533,2\n265#1:535\n265#1:536,2\n265#1:538\n273#1:539,2\n273#1:541\n273#1:542,2\n273#1:544\n279#1:545,2\n279#1:547\n279#1:548,2\n279#1:550\n285#1:551,2\n285#1:553\n285#1:554,2\n285#1:556\n291#1:557,2\n291#1:559\n291#1:560,2\n291#1:562\n297#1:563,2\n297#1:565\n297#1:566,2\n297#1:568\n303#1:569,2\n303#1:571\n303#1:572,2\n303#1:574\n309#1:575,2\n309#1:577\n309#1:578,2\n309#1:580\n315#1:581,2\n315#1:583\n315#1:584,2\n315#1:586\n332#1:587\n332#1:588,2\n332#1:590\n332#1:591\n332#1:592,2\n332#1:594\n332#1:595\n332#1:596,2\n332#1:598\n343#1:599\n343#1:600,2\n343#1:602\n343#1:603\n343#1:604,2\n343#1:606\n343#1:607\n343#1:608,2\n343#1:610\n354#1:611\n354#1:612,2\n354#1:614\n354#1:615\n354#1:616,2\n354#1:618\n354#1:619\n354#1:620,2\n354#1:622\n365#1:623\n365#1:624,2\n365#1:626\n365#1:627\n365#1:628,2\n365#1:630\n365#1:631\n365#1:632,2\n365#1:634\n376#1:635\n376#1:636,2\n376#1:638\n376#1:639\n376#1:640,2\n376#1:642\n376#1:643\n376#1:644,2\n376#1:646\n387#1:647\n387#1:648,2\n387#1:650\n387#1:651\n387#1:652,2\n387#1:654\n387#1:655\n387#1:656,2\n387#1:658\n398#1:659\n398#1:660,2\n398#1:662\n398#1:663\n398#1:664,2\n398#1:666\n398#1:667\n398#1:668,2\n398#1:670\n407#1:671\n407#1:672,2\n407#1:674\n407#1:675\n407#1:676,2\n407#1:678\n407#1:679\n407#1:680,2\n407#1:682\n416#1:683\n416#1:684,2\n416#1:686\n416#1:687\n416#1:688,2\n416#1:690\n416#1:691\n416#1:692,2\n416#1:694\n425#1:695\n425#1:696,2\n425#1:698\n425#1:699\n425#1:700,2\n425#1:702\n425#1:703\n425#1:704,2\n425#1:706\n434#1:707\n434#1:708,2\n434#1:710\n434#1:711\n434#1:712,2\n434#1:714\n434#1:715\n434#1:716,2\n434#1:718\n443#1:719\n443#1:720,2\n443#1:722\n443#1:723\n443#1:724,2\n443#1:726\n443#1:727\n443#1:728,2\n443#1:730\n452#1:731\n452#1:732,2\n452#1:734\n452#1:735\n452#1:736,2\n452#1:738\n452#1:739\n452#1:740,2\n452#1:742\n461#1:743\n461#1:744,2\n461#1:746\n461#1:747\n461#1:748,2\n461#1:750\n461#1:751\n461#1:752,2\n461#1:754\n*E\n"})
/* loaded from: classes4.dex */
public final class BuildersKt {
    public static /* synthetic */ Object request$default(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            httpRequestBuilder = new HttpRequestBuilder();
        }
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object request(@NotNull HttpClient httpClient, @NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super HttpResponse> continuation) {
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object request$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpResponse> continuation) {
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object prepareRequest$default(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            httpRequestBuilder = new HttpRequestBuilder();
        }
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object prepareRequest(@NotNull HttpClient httpClient, @NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super HttpStatement> continuation) {
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareRequest$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpStatement> continuation) {
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object request(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object request$$forInline(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object prepareRequest(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareRequest$$forInline(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object request$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersKt.request.4
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
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object prepareRequest$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersKt.prepareRequest.4
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
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object request$default(HttpClient httpClient, Url url, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersKt.request.7
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
        BuildersWithUrlKt.url(httpRequestBuilder, url);
        function1.invoke(httpRequestBuilder);
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object prepareRequest$default(HttpClient httpClient, Url url, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersKt.prepareRequest.7
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
        BuildersWithUrlKt.url(httpRequestBuilder, url);
        function1.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object get(@NotNull HttpClient httpClient, @NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super HttpResponse> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object get$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpResponse> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object post(@NotNull HttpClient httpClient, @NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super HttpResponse> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object post$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpResponse> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object put(@NotNull HttpClient httpClient, @NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super HttpResponse> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object put$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpResponse> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object delete(@NotNull HttpClient httpClient, @NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super HttpResponse> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object delete$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpResponse> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object options(@NotNull HttpClient httpClient, @NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super HttpResponse> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object options$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpResponse> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object patch(@NotNull HttpClient httpClient, @NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super HttpResponse> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object patch$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpResponse> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object head(@NotNull HttpClient httpClient, @NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super HttpResponse> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object head$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpResponse> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object prepareGet(@NotNull HttpClient httpClient, @NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super HttpStatement> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareGet$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpStatement> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object preparePost(@NotNull HttpClient httpClient, @NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super HttpStatement> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object preparePost$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpStatement> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object preparePut(@NotNull HttpClient httpClient, @NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super HttpStatement> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object preparePut$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpStatement> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object prepareDelete(@NotNull HttpClient httpClient, @NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super HttpStatement> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareDelete$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpStatement> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object prepareOptions(@NotNull HttpClient httpClient, @NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super HttpStatement> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareOptions$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpStatement> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object preparePatch(@NotNull HttpClient httpClient, @NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super HttpStatement> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object preparePatch$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpStatement> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object prepareHead(@NotNull HttpClient httpClient, @NotNull HttpRequestBuilder httpRequestBuilder, @NotNull Continuation<? super HttpStatement> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareHead$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpStatement> continuation) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object get(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object get$$forInline(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object post(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object post$$forInline(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object put(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object put$$forInline(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object delete(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object delete$$forInline(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object options(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object options$$forInline(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object patch(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object patch$$forInline(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object head(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object head$$forInline(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object prepareGet(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareGet$$forInline(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object preparePost(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object preparePost$$forInline(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object preparePut(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object preparePut$$forInline(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object prepareDelete(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareDelete$$forInline(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object prepareOptions(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareOptions$$forInline(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object preparePatch(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object preparePatch$$forInline(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object prepareHead(@NotNull HttpClient httpClient, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareHead$$forInline(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @NotNull
    public static final HttpRequestBuilder request(@NotNull Function1<? super HttpRequestBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        block.invoke(httpRequestBuilder);
        return httpRequestBuilder;
    }

    public static /* synthetic */ Object get$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersKt.get.4
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
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object post$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersKt.post.4
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
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object put$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersKt.put.4
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
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object delete$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersKt.delete.4
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
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object options$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersKt.options.4
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
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object patch$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersKt.patch.4
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
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object head$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersKt.head.4
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
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    public static /* synthetic */ Object prepareGet$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersKt.prepareGet.4
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
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object preparePost$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersKt.preparePost.4
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
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object preparePut$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersKt.preparePut.4
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
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareDelete$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersKt.prepareDelete.4
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
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareOptions$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersKt.prepareOptions.4
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
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object preparePatch$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersKt.preparePatch.4
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
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareHead$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<HttpRequestBuilder, Unit>() { // from class: io.ktor.client.request.BuildersKt.prepareHead.4
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
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object request(@NotNull HttpClient httpClient, @NotNull String str, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object request$$forInline(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object prepareRequest(@NotNull HttpClient httpClient, @NotNull String str, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareRequest$$forInline(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object request(@NotNull HttpClient httpClient, @NotNull Url url, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        BuildersWithUrlKt.url(httpRequestBuilder, url);
        function1.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object request$$forInline(HttpClient httpClient, Url url, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        BuildersWithUrlKt.url(httpRequestBuilder, url);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        InlineMarker.mark(0);
        Object objExecute = httpStatement.execute(continuation);
        InlineMarker.mark(1);
        return objExecute;
    }

    @Nullable
    public static final Object prepareRequest(@NotNull HttpClient httpClient, @NotNull Url url, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        BuildersWithUrlKt.url(httpRequestBuilder, url);
        function1.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareRequest$$forInline(HttpClient httpClient, Url url, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        BuildersWithUrlKt.url(httpRequestBuilder, url);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object get(@NotNull HttpClient httpClient, @NotNull String str, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object get$$forInline(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
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
    public static final Object post(@NotNull HttpClient httpClient, @NotNull String str, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object post$$forInline(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
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
    public static final Object put(@NotNull HttpClient httpClient, @NotNull String str, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object put$$forInline(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
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
    public static final Object delete(@NotNull HttpClient httpClient, @NotNull String str, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object delete$$forInline(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
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
    public static final Object options(@NotNull HttpClient httpClient, @NotNull String str, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object options$$forInline(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
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
    public static final Object patch(@NotNull HttpClient httpClient, @NotNull String str, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object patch$$forInline(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
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
    public static final Object head(@NotNull HttpClient httpClient, @NotNull String str, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Object head$$forInline(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpResponse> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
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
    public static final Object prepareGet(@NotNull HttpClient httpClient, @NotNull String str, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareGet$$forInline(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object preparePost(@NotNull HttpClient httpClient, @NotNull String str, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object preparePost$$forInline(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object preparePut(@NotNull HttpClient httpClient, @NotNull String str, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object preparePut$$forInline(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object prepareDelete(@NotNull HttpClient httpClient, @NotNull String str, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareDelete$$forInline(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object prepareOptions(@NotNull HttpClient httpClient, @NotNull String str, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareOptions$$forInline(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object preparePatch(@NotNull HttpClient httpClient, @NotNull String str, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object preparePatch$$forInline(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    @Nullable
    public static final Object prepareHead(@NotNull HttpClient httpClient, @NotNull String str, @NotNull Function1<? super HttpRequestBuilder, Unit> function1, @NotNull Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareHead$$forInline(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super HttpStatement> continuation) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        Unit unit = Unit.INSTANCE;
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }
}
