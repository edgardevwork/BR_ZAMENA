package org.jfrog.build.extractor.clientConfiguration.client.artifactory;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.http.Header;
import org.jfrog.build.api.dependency.BuildPatternArtifacts;
import org.jfrog.build.api.dependency.BuildPatternArtifactsRequest;
import org.jfrog.build.api.dependency.PatternResultFileSet;
import org.jfrog.build.api.dependency.PropertySearchResult;
import org.jfrog.build.api.release.Distribution;
import org.jfrog.build.api.release.Promotion;
import org.jfrog.build.api.search.AqlSearchResult;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.ArtifactoryUploadResponse;
import org.jfrog.build.client.ArtifactoryVersion;
import org.jfrog.build.client.DownloadResponse;
import org.jfrog.build.client.ItemLastModified;
import org.jfrog.build.client.artifactoryXrayResponse.ArtifactoryXrayResponse;
import org.jfrog.build.extractor.clientConfiguration.client.ManagerBase;
import org.jfrog.build.extractor.clientConfiguration.client.RepositoryType;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.CheckRepositoryType;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.CreateRepository;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.DeleteBuilds;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.DeleteProperties;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.DeleteRepository;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.DeleteRepositoryContent;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.DistributeBuild;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.Download;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.DownloadHeaders;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.DownloadToFile;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.ExecuteUserPlugin;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.GetAllBuildNumbers;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.GetBuildInfo;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.GetItemLastModified;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.GetNpmAuth;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.GetRepositoriesKeys;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.GetStagingStrategy;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.GetUserPluginInfo;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.IsRepositoryExist;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.PromotionUserPlugin;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.PublishBuildInfo;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.ReportUsage;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.RetrievePatternArtifacts;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.ScanBuild;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.SearchArtifactsByAql;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.SearchArtifactsByPattern;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.SearchArtifactsByProperties;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.SendBuildRetention;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.SendModuleInfo;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.SetProperties;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.StageBuild;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.UpdateFileProperty;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.Upload;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.Version;
import org.jfrog.build.extractor.clientConfiguration.client.response.GetAllBuildNumbersResponse;
import org.jfrog.build.extractor.clientConfiguration.deploy.DeployDetails;
import org.jfrog.build.extractor.p065ci.BuildInfo;
import org.jfrog.build.extractor.p065ci.BuildRetention;
import org.jfrog.build.extractor.usageReport.UsageReporter;

/* loaded from: classes5.dex */
public class ArtifactoryManager extends ManagerBase {
    public static final String LAST_RELEASE = "LAST_RELEASE";
    public static final String LATEST = "LATEST";

    public ArtifactoryManager(String str, String str2, String str3, String str4, Log log) {
        super(str, str2, str3, str4, log);
    }

    public ArtifactoryManager(String str, String str2, String str3, Log log) {
        super(str, str2, str3, "", log);
    }

    public ArtifactoryManager(String str, String str2, Log log) {
        super(str, "", "", str2, log);
    }

    public ArtifactoryManager(String str, Log log) {
        super(str, "", "", "", log);
    }

    public boolean isLocalRepo(String str) throws IOException {
        return new CheckRepositoryType(RepositoryType.LOCAL, str, this.log).execute(this.jfrogHttpClient).booleanValue();
    }

    public boolean isRemoteRepo(String str) throws IOException {
        return new CheckRepositoryType(RepositoryType.REMOTE, str, this.log).execute(this.jfrogHttpClient).booleanValue();
    }

    public void deleteProperties(String str, String str2) throws IOException {
        new DeleteProperties(str, str2, this.log).execute(this.jfrogHttpClient);
    }

    public void setProperties(String str, String str2, boolean z) throws IOException {
        new SetProperties(str, str2, z, this.log).execute(this.jfrogHttpClient);
    }

    public void setProperties(String str, ArrayListMultimap<String, String> arrayListMultimap, boolean z) throws IOException {
        new SetProperties(str, arrayListMultimap, z, this.log).execute(this.jfrogHttpClient);
    }

    public void distributeBuild(String str, String str2, Distribution distribution) throws IOException {
        new DistributeBuild(str, str2, distribution, this.log).execute(this.jfrogHttpClient);
    }

    public DownloadResponse download(String str) throws IOException {
        return download(str, null);
    }

    public DownloadResponse download(String str, Map<String, String> map) throws IOException {
        return new Download(str, map, this.log).execute(this.jfrogHttpClient);
    }

    public Header[] downloadHeaders(String str) throws IOException {
        return downloadHeaders(str, null);
    }

    public Header[] downloadHeaders(String str, Map<String, String> map) throws IOException {
        return new DownloadHeaders(str, map, this.log).execute(this.jfrogHttpClient);
    }

    public File downloadToFile(String str, String str2) throws IOException {
        return downloadToFile(str, str2, null);
    }

    public File downloadToFile(String str, String str2, Map<String, String> map) throws IOException {
        return new DownloadToFile(str, str2, map, this.log).execute(this.jfrogHttpClient);
    }

    public void executeUserPlugin(String str, Map<String, String> map) throws IOException {
        new ExecuteUserPlugin(str, map, this.log).execute(this.jfrogHttpClient);
    }

    public void promotionUserPlugin(String str, String str2, String str3, Map<String, String> map) throws IOException {
        new PromotionUserPlugin(str, str2, str3, map, this.log).execute(this.jfrogHttpClient);
    }

    public ItemLastModified getItemLastModified(String str) throws IOException {
        return new GetItemLastModified(str, this.log).execute(this.jfrogHttpClient);
    }

    public Properties getNpmAuth() throws IOException {
        return new GetNpmAuth(this.log).execute(this.jfrogHttpClient);
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.ManagerBase
    public ArtifactoryVersion getVersion() throws IOException {
        return new Version(this.log).execute(this.jfrogHttpClient);
    }

    public void publishBuildInfo(BuildInfo buildInfo, String str) throws IOException {
        new PublishBuildInfo(buildInfo, str, this.log).execute(this.jfrogHttpClient);
    }

    public void sendModuleInfo(BuildInfo buildInfo) throws IOException {
        new SendModuleInfo(buildInfo, this.log).execute(this.jfrogHttpClient);
    }

    public GetAllBuildNumbersResponse getAllBuildNumbers(String str, String str2) throws IOException {
        return new GetAllBuildNumbers(str, str2, this.log).execute(this.jfrogHttpClient);
    }

    public void deleteBuilds(String str, String str2, boolean z) throws IOException {
        new DeleteBuilds(str, str2, z, this.log).execute(this.jfrogHttpClient);
    }

    public void deleteBuilds(String str, String str2, boolean z, String... strArr) throws IOException {
        new DeleteBuilds(str, str2, strArr, z, this.log).execute(this.jfrogHttpClient);
    }

    public BuildInfo getBuildInfo(String str, String str2, String str3) throws IOException {
        if (("LATEST".equals(str2.trim()) || "LAST_RELEASE".equals(str2.trim())) && (str2 = getLatestBuildNumber(str, str2, str3)) == null) {
            return null;
        }
        return new GetBuildInfo(str, str2, str3, this.log).execute(this.jfrogHttpClient);
    }

    public List<String> getLocalRepositoriesKeys() throws IOException {
        return new GetRepositoriesKeys(RepositoryType.LOCAL, this.log).execute(this.jfrogHttpClient);
    }

    public List<String> getRemoteRepositoriesKeys() throws IOException {
        return new GetRepositoriesKeys(RepositoryType.REMOTE, this.log).execute(this.jfrogHttpClient);
    }

    public List<String> getVirtualRepositoriesKeys() throws IOException {
        return new GetRepositoriesKeys(RepositoryType.VIRTUAL, this.log).execute(this.jfrogHttpClient);
    }

    public List<String> getFederatedRepositoriesKeys() throws IOException {
        return new GetRepositoriesKeys(RepositoryType.FEDERATED, this.log).execute(this.jfrogHttpClient);
    }

    public Map getStagingStrategy(String str, String str2, Map<String, String> map) throws IOException {
        return new GetStagingStrategy(str, str2, map, this.log).execute(this.jfrogHttpClient);
    }

    public Map<String, List<Map>> getUserPluginInfo() throws IOException {
        return new GetUserPluginInfo(this.log).execute(this.jfrogHttpClient);
    }

    public boolean isRepositoryExist(String str) throws IOException {
        return new IsRepositoryExist(str, this.log).execute(this.jfrogHttpClient).booleanValue();
    }

    public void reportUsage(UsageReporter usageReporter) throws IOException {
        new ReportUsage(usageReporter, this.log).execute(this.jfrogHttpClient);
    }

    public List<BuildPatternArtifacts> retrievePatternArtifacts(List<BuildPatternArtifactsRequest> list) throws IOException {
        return new RetrievePatternArtifacts(list, this.log).execute(this.jfrogHttpClient);
    }

    public ArtifactoryXrayResponse scanBuild(String str, String str2, String str3, String str4) throws IOException {
        setConnectionTimeout(90);
        return new ScanBuild(str, str2, str3, str4, this.log).execute(this.jfrogHttpClient);
    }

    public AqlSearchResult searchArtifactsByAql(String str) throws IOException {
        return new SearchArtifactsByAql(str, this.log).execute(this.jfrogHttpClient);
    }

    public PatternResultFileSet searchArtifactsByPattern(String str) throws IOException {
        return new SearchArtifactsByPattern(str, this.log).execute(this.jfrogHttpClient);
    }

    public PropertySearchResult searchArtifactsByProperties(String str) throws IOException {
        return new SearchArtifactsByProperties(str, this.log).execute(this.jfrogHttpClient);
    }

    public void sendBuildRetention(BuildRetention buildRetention, String str, String str2, boolean z) throws IOException {
        new SendBuildRetention(buildRetention, str, str2, z, this.log).execute(this.jfrogHttpClient);
    }

    public void stageBuild(String str, String str2, String str3, Promotion promotion) throws IOException {
        new StageBuild(str, str2, str3, promotion, this.log).execute(this.jfrogHttpClient);
    }

    public void updateFileProperty(String str, String str2) throws IOException {
        new UpdateFileProperty(str, str2, this.log).execute(this.jfrogHttpClient);
    }

    public ArtifactoryUploadResponse upload(DeployDetails deployDetails) throws IOException {
        return upload(deployDetails, null, null);
    }

    public ArtifactoryUploadResponse upload(DeployDetails deployDetails, String str) throws IOException {
        return upload(deployDetails, str, null);
    }

    public ArtifactoryUploadResponse upload(DeployDetails deployDetails, String str, Integer num) throws IOException {
        return new Upload(deployDetails, str, num, this.log).execute(this.jfrogHttpClient);
    }

    public void deleteRepository(String str) throws IOException {
        new DeleteRepository(str, this.log).execute(this.jfrogHttpClient);
    }

    public void deleteRepositoryContent(String str) throws IOException {
        new DeleteRepositoryContent(str, this.log).execute(this.jfrogHttpClient);
    }

    public void createRepository(String str, String str2) throws IOException {
        new CreateRepository(str, str2, this.log).execute(this.jfrogHttpClient);
    }

    public String getLatestBuildNumber(String str, String str2, String str3) throws IOException {
        if (!"LATEST".equals(str2.trim()) && "LAST_RELEASE".equals(str2.trim())) {
            this.log.warn("GetLatestBuildNumber accepts only two latest types: LATEST or LAST_RELEASE");
            return null;
        }
        if (new Version(this.log).execute(this.jfrogHttpClient).isOSS()) {
            throw new IllegalArgumentException(String.format("%s is not supported in Artifactory OSS.", str2));
        }
        ArrayList arrayListNewArrayList = Lists.newArrayList();
        arrayListNewArrayList.add(new BuildPatternArtifactsRequest(str, str2, str3));
        List<BuildPatternArtifacts> listRetrievePatternArtifacts = retrievePatternArtifacts(arrayListNewArrayList);
        if (listRetrievePatternArtifacts.get(0) != null) {
            return listRetrievePatternArtifacts.get(0).getBuildNumber();
        }
        return null;
    }
}
