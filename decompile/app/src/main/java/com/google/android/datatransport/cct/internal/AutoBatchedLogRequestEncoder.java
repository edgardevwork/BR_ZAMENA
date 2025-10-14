package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class AutoBatchedLogRequestEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoBatchedLogRequestEncoder();

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        BatchedLogRequestEncoder batchedLogRequestEncoder = BatchedLogRequestEncoder.INSTANCE;
        encoderConfig.registerEncoder(BatchedLogRequest.class, batchedLogRequestEncoder);
        encoderConfig.registerEncoder(AutoValue_BatchedLogRequest.class, batchedLogRequestEncoder);
        LogRequestEncoder logRequestEncoder = LogRequestEncoder.INSTANCE;
        encoderConfig.registerEncoder(LogRequest.class, logRequestEncoder);
        encoderConfig.registerEncoder(AutoValue_LogRequest.class, logRequestEncoder);
        ClientInfoEncoder clientInfoEncoder = ClientInfoEncoder.INSTANCE;
        encoderConfig.registerEncoder(ClientInfo.class, clientInfoEncoder);
        encoderConfig.registerEncoder(AutoValue_ClientInfo.class, clientInfoEncoder);
        AndroidClientInfoEncoder androidClientInfoEncoder = AndroidClientInfoEncoder.INSTANCE;
        encoderConfig.registerEncoder(AndroidClientInfo.class, androidClientInfoEncoder);
        encoderConfig.registerEncoder(AutoValue_AndroidClientInfo.class, androidClientInfoEncoder);
        LogEventEncoder logEventEncoder = LogEventEncoder.INSTANCE;
        encoderConfig.registerEncoder(LogEvent.class, logEventEncoder);
        encoderConfig.registerEncoder(AutoValue_LogEvent.class, logEventEncoder);
        ComplianceDataEncoder complianceDataEncoder = ComplianceDataEncoder.INSTANCE;
        encoderConfig.registerEncoder(ComplianceData.class, complianceDataEncoder);
        encoderConfig.registerEncoder(AutoValue_ComplianceData.class, complianceDataEncoder);
        ExternalPrivacyContextEncoder externalPrivacyContextEncoder = ExternalPrivacyContextEncoder.INSTANCE;
        encoderConfig.registerEncoder(ExternalPrivacyContext.class, externalPrivacyContextEncoder);
        encoderConfig.registerEncoder(AutoValue_ExternalPrivacyContext.class, externalPrivacyContextEncoder);
        ExternalPRequestContextEncoder externalPRequestContextEncoder = ExternalPRequestContextEncoder.INSTANCE;
        encoderConfig.registerEncoder(ExternalPRequestContext.class, externalPRequestContextEncoder);
        encoderConfig.registerEncoder(AutoValue_ExternalPRequestContext.class, externalPRequestContextEncoder);
        NetworkConnectionInfoEncoder networkConnectionInfoEncoder = NetworkConnectionInfoEncoder.INSTANCE;
        encoderConfig.registerEncoder(NetworkConnectionInfo.class, networkConnectionInfoEncoder);
        encoderConfig.registerEncoder(AutoValue_NetworkConnectionInfo.class, networkConnectionInfoEncoder);
        ExperimentIdsEncoder experimentIdsEncoder = ExperimentIdsEncoder.INSTANCE;
        encoderConfig.registerEncoder(ExperimentIds.class, experimentIdsEncoder);
        encoderConfig.registerEncoder(AutoValue_ExperimentIds.class, experimentIdsEncoder);
    }

    /* loaded from: classes8.dex */
    public static final class BatchedLogRequestEncoder implements ObjectEncoder<BatchedLogRequest> {
        public static final BatchedLogRequestEncoder INSTANCE = new BatchedLogRequestEncoder();
        public static final FieldDescriptor LOGREQUEST_DESCRIPTOR = FieldDescriptor.m1375of("logRequest");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(BatchedLogRequest batchedLogRequest, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(LOGREQUEST_DESCRIPTOR, batchedLogRequest.getLogRequests());
        }
    }

    /* loaded from: classes8.dex */
    public static final class LogRequestEncoder implements ObjectEncoder<LogRequest> {
        public static final LogRequestEncoder INSTANCE = new LogRequestEncoder();
        public static final FieldDescriptor REQUESTTIMEMS_DESCRIPTOR = FieldDescriptor.m1375of("requestTimeMs");
        public static final FieldDescriptor REQUESTUPTIMEMS_DESCRIPTOR = FieldDescriptor.m1375of("requestUptimeMs");
        public static final FieldDescriptor CLIENTINFO_DESCRIPTOR = FieldDescriptor.m1375of("clientInfo");
        public static final FieldDescriptor LOGSOURCE_DESCRIPTOR = FieldDescriptor.m1375of("logSource");
        public static final FieldDescriptor LOGSOURCENAME_DESCRIPTOR = FieldDescriptor.m1375of("logSourceName");
        public static final FieldDescriptor LOGEVENT_DESCRIPTOR = FieldDescriptor.m1375of("logEvent");
        public static final FieldDescriptor QOSTIER_DESCRIPTOR = FieldDescriptor.m1375of("qosTier");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(LogRequest logRequest, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(REQUESTTIMEMS_DESCRIPTOR, logRequest.getRequestTimeMs());
            objectEncoderContext.add(REQUESTUPTIMEMS_DESCRIPTOR, logRequest.getRequestUptimeMs());
            objectEncoderContext.add(CLIENTINFO_DESCRIPTOR, logRequest.getClientInfo());
            objectEncoderContext.add(LOGSOURCE_DESCRIPTOR, logRequest.getLogSource());
            objectEncoderContext.add(LOGSOURCENAME_DESCRIPTOR, logRequest.getLogSourceName());
            objectEncoderContext.add(LOGEVENT_DESCRIPTOR, logRequest.getLogEvents());
            objectEncoderContext.add(QOSTIER_DESCRIPTOR, logRequest.getQosTier());
        }
    }

    /* loaded from: classes8.dex */
    public static final class ClientInfoEncoder implements ObjectEncoder<ClientInfo> {
        public static final ClientInfoEncoder INSTANCE = new ClientInfoEncoder();
        public static final FieldDescriptor CLIENTTYPE_DESCRIPTOR = FieldDescriptor.m1375of("clientType");
        public static final FieldDescriptor ANDROIDCLIENTINFO_DESCRIPTOR = FieldDescriptor.m1375of("androidClientInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(ClientInfo clientInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(CLIENTTYPE_DESCRIPTOR, clientInfo.getClientType());
            objectEncoderContext.add(ANDROIDCLIENTINFO_DESCRIPTOR, clientInfo.getAndroidClientInfo());
        }
    }

    /* loaded from: classes8.dex */
    public static final class AndroidClientInfoEncoder implements ObjectEncoder<AndroidClientInfo> {
        public static final AndroidClientInfoEncoder INSTANCE = new AndroidClientInfoEncoder();
        public static final FieldDescriptor SDKVERSION_DESCRIPTOR = FieldDescriptor.m1375of(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);
        public static final FieldDescriptor MODEL_DESCRIPTOR = FieldDescriptor.m1375of("model");
        public static final FieldDescriptor HARDWARE_DESCRIPTOR = FieldDescriptor.m1375of(CctTransportBackend.KEY_HARDWARE);
        public static final FieldDescriptor DEVICE_DESCRIPTOR = FieldDescriptor.m1375of(CctTransportBackend.KEY_DEVICE);
        public static final FieldDescriptor PRODUCT_DESCRIPTOR = FieldDescriptor.m1375of(CctTransportBackend.KEY_PRODUCT);
        public static final FieldDescriptor OSBUILD_DESCRIPTOR = FieldDescriptor.m1375of("osBuild");
        public static final FieldDescriptor MANUFACTURER_DESCRIPTOR = FieldDescriptor.m1375of("manufacturer");
        public static final FieldDescriptor FINGERPRINT_DESCRIPTOR = FieldDescriptor.m1375of(CctTransportBackend.KEY_FINGERPRINT);
        public static final FieldDescriptor LOCALE_DESCRIPTOR = FieldDescriptor.m1375of("locale");
        public static final FieldDescriptor COUNTRY_DESCRIPTOR = FieldDescriptor.m1375of(CctTransportBackend.KEY_COUNTRY);
        public static final FieldDescriptor MCCMNC_DESCRIPTOR = FieldDescriptor.m1375of("mccMnc");
        public static final FieldDescriptor APPLICATIONBUILD_DESCRIPTOR = FieldDescriptor.m1375of("applicationBuild");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(AndroidClientInfo androidClientInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(SDKVERSION_DESCRIPTOR, androidClientInfo.getSdkVersion());
            objectEncoderContext.add(MODEL_DESCRIPTOR, androidClientInfo.getModel());
            objectEncoderContext.add(HARDWARE_DESCRIPTOR, androidClientInfo.getHardware());
            objectEncoderContext.add(DEVICE_DESCRIPTOR, androidClientInfo.getDevice());
            objectEncoderContext.add(PRODUCT_DESCRIPTOR, androidClientInfo.getProduct());
            objectEncoderContext.add(OSBUILD_DESCRIPTOR, androidClientInfo.getOsBuild());
            objectEncoderContext.add(MANUFACTURER_DESCRIPTOR, androidClientInfo.getManufacturer());
            objectEncoderContext.add(FINGERPRINT_DESCRIPTOR, androidClientInfo.getFingerprint());
            objectEncoderContext.add(LOCALE_DESCRIPTOR, androidClientInfo.getLocale());
            objectEncoderContext.add(COUNTRY_DESCRIPTOR, androidClientInfo.getCountry());
            objectEncoderContext.add(MCCMNC_DESCRIPTOR, androidClientInfo.getMccMnc());
            objectEncoderContext.add(APPLICATIONBUILD_DESCRIPTOR, androidClientInfo.getApplicationBuild());
        }
    }

    /* loaded from: classes8.dex */
    public static final class LogEventEncoder implements ObjectEncoder<LogEvent> {
        public static final LogEventEncoder INSTANCE = new LogEventEncoder();
        public static final FieldDescriptor EVENTTIMEMS_DESCRIPTOR = FieldDescriptor.m1375of("eventTimeMs");
        public static final FieldDescriptor EVENTCODE_DESCRIPTOR = FieldDescriptor.m1375of("eventCode");
        public static final FieldDescriptor COMPLIANCEDATA_DESCRIPTOR = FieldDescriptor.m1375of("complianceData");
        public static final FieldDescriptor EVENTUPTIMEMS_DESCRIPTOR = FieldDescriptor.m1375of("eventUptimeMs");
        public static final FieldDescriptor SOURCEEXTENSION_DESCRIPTOR = FieldDescriptor.m1375of("sourceExtension");
        public static final FieldDescriptor SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR = FieldDescriptor.m1375of("sourceExtensionJsonProto3");
        public static final FieldDescriptor TIMEZONEOFFSETSECONDS_DESCRIPTOR = FieldDescriptor.m1375of("timezoneOffsetSeconds");
        public static final FieldDescriptor NETWORKCONNECTIONINFO_DESCRIPTOR = FieldDescriptor.m1375of("networkConnectionInfo");
        public static final FieldDescriptor EXPERIMENTIDS_DESCRIPTOR = FieldDescriptor.m1375of("experimentIds");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(LogEvent logEvent, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(EVENTTIMEMS_DESCRIPTOR, logEvent.getEventTimeMs());
            objectEncoderContext.add(EVENTCODE_DESCRIPTOR, logEvent.getEventCode());
            objectEncoderContext.add(COMPLIANCEDATA_DESCRIPTOR, logEvent.getComplianceData());
            objectEncoderContext.add(EVENTUPTIMEMS_DESCRIPTOR, logEvent.getEventUptimeMs());
            objectEncoderContext.add(SOURCEEXTENSION_DESCRIPTOR, logEvent.getSourceExtension());
            objectEncoderContext.add(SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR, logEvent.getSourceExtensionJsonProto3());
            objectEncoderContext.add(TIMEZONEOFFSETSECONDS_DESCRIPTOR, logEvent.getTimezoneOffsetSeconds());
            objectEncoderContext.add(NETWORKCONNECTIONINFO_DESCRIPTOR, logEvent.getNetworkConnectionInfo());
            objectEncoderContext.add(EXPERIMENTIDS_DESCRIPTOR, logEvent.getExperimentIds());
        }
    }

    /* loaded from: classes8.dex */
    public static final class ComplianceDataEncoder implements ObjectEncoder<ComplianceData> {
        public static final ComplianceDataEncoder INSTANCE = new ComplianceDataEncoder();
        public static final FieldDescriptor PRIVACYCONTEXT_DESCRIPTOR = FieldDescriptor.m1375of("privacyContext");
        public static final FieldDescriptor PRODUCTIDORIGIN_DESCRIPTOR = FieldDescriptor.m1375of("productIdOrigin");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(ComplianceData complianceData, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(PRIVACYCONTEXT_DESCRIPTOR, complianceData.getPrivacyContext());
            objectEncoderContext.add(PRODUCTIDORIGIN_DESCRIPTOR, complianceData.getProductIdOrigin());
        }
    }

    /* loaded from: classes8.dex */
    public static final class ExternalPrivacyContextEncoder implements ObjectEncoder<ExternalPrivacyContext> {
        public static final ExternalPrivacyContextEncoder INSTANCE = new ExternalPrivacyContextEncoder();
        public static final FieldDescriptor PREQUEST_DESCRIPTOR = FieldDescriptor.m1375of("prequest");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(ExternalPrivacyContext externalPrivacyContext, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(PREQUEST_DESCRIPTOR, externalPrivacyContext.getPrequest());
        }
    }

    /* loaded from: classes8.dex */
    public static final class ExternalPRequestContextEncoder implements ObjectEncoder<ExternalPRequestContext> {
        public static final ExternalPRequestContextEncoder INSTANCE = new ExternalPRequestContextEncoder();
        public static final FieldDescriptor ORIGINASSOCIATEDPRODUCTID_DESCRIPTOR = FieldDescriptor.m1375of("originAssociatedProductId");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(ExternalPRequestContext externalPRequestContext, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(ORIGINASSOCIATEDPRODUCTID_DESCRIPTOR, externalPRequestContext.getOriginAssociatedProductId());
        }
    }

    /* loaded from: classes8.dex */
    public static final class NetworkConnectionInfoEncoder implements ObjectEncoder<NetworkConnectionInfo> {
        public static final NetworkConnectionInfoEncoder INSTANCE = new NetworkConnectionInfoEncoder();
        public static final FieldDescriptor NETWORKTYPE_DESCRIPTOR = FieldDescriptor.m1375of("networkType");
        public static final FieldDescriptor MOBILESUBTYPE_DESCRIPTOR = FieldDescriptor.m1375of("mobileSubtype");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(NetworkConnectionInfo networkConnectionInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(NETWORKTYPE_DESCRIPTOR, networkConnectionInfo.getNetworkType());
            objectEncoderContext.add(MOBILESUBTYPE_DESCRIPTOR, networkConnectionInfo.getMobileSubtype());
        }
    }

    /* loaded from: classes8.dex */
    public static final class ExperimentIdsEncoder implements ObjectEncoder<ExperimentIds> {
        public static final ExperimentIdsEncoder INSTANCE = new ExperimentIdsEncoder();
        public static final FieldDescriptor CLEARBLOB_DESCRIPTOR = FieldDescriptor.m1375of("clearBlob");
        public static final FieldDescriptor ENCRYPTEDBLOB_DESCRIPTOR = FieldDescriptor.m1375of("encryptedBlob");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(ExperimentIds experimentIds, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(CLEARBLOB_DESCRIPTOR, experimentIds.getClearBlob());
            objectEncoderContext.add(ENCRYPTEDBLOB_DESCRIPTOR, experimentIds.getEncryptedBlob());
        }
    }
}
