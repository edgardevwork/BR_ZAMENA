package com.sdkit.paylib.paylibdomain.api.entity;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jfrog.build.extractor.scan.Scope;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/entity/AsyncState;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "Content", "Error", "Loading", Scope.NONE_SCOPE, "Lcom/sdkit/paylib/paylibdomain/api/entity/AsyncState$Content;", "Lcom/sdkit/paylib/paylibdomain/api/entity/AsyncState$Error;", "Lcom/sdkit/paylib/paylibdomain/api/entity/AsyncState$Loading;", "Lcom/sdkit/paylib/paylibdomain/api/entity/AsyncState$None;", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public abstract class AsyncState<T> {

    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0005¨\u0006\u0015"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/entity/AsyncState$Content;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/sdkit/paylib/paylibdomain/api/entity/AsyncState;", "component1", "()Ljava/lang/Object;", "content", "copy", "(Ljava/lang/Object;)Lcom/sdkit/paylib/paylibdomain/api/entity/AsyncState$Content;", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Object;", "getContent", SegmentConstantPool.INITSTRING, "(Ljava/lang/Object;)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class Content<T> extends AsyncState<T> {

        /* renamed from: a, reason: from kotlin metadata */
        public final Object content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(T content) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = content.content;
            }
            return content.copy(obj);
        }

        public final T component1() {
            return (T) this.content;
        }

        public final Content<T> copy(T content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Content<>(content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Content) && Intrinsics.areEqual(this.content, ((Content) other).content);
        }

        public final T getContent() {
            return (T) this.content;
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "Content(content=" + this.content + ')';
        }
    }

    @Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/entity/AsyncState$Error;", "Lcom/sdkit/paylib/paylibdomain/api/entity/AsyncState;", "", "", "component1", "error", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", SegmentConstantPool.INITSTRING, "(Ljava/lang/Throwable;)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class Error extends AsyncState {

        /* renamed from: a, reason: from kotlin metadata */
        public final Throwable error;

        public Error(Throwable th) {
            super(null);
            this.error = th;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Error copy(Throwable error) {
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            Throwable th = this.error;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ')';
        }
    }

    @Metadata(m7104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/entity/AsyncState$Loading;", "Lcom/sdkit/paylib/paylibdomain/api/entity/AsyncState;", "", "()V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Loading extends AsyncState {
        public static final Loading INSTANCE = new Loading();

        public Loading() {
            super(null);
        }
    }

    @Metadata(m7104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/entity/AsyncState$None;", "Lcom/sdkit/paylib/paylibdomain/api/entity/AsyncState;", "", "()V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class None extends AsyncState {
        public static final None INSTANCE = new None();

        public None() {
            super(null);
        }
    }

    public AsyncState() {
    }

    public /* synthetic */ AsyncState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
