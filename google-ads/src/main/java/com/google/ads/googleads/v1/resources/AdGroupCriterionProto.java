// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/ad_group_criterion.proto

package com.google.ads.googleads.v1.resources;

public final class AdGroupCriterionProto {
  private AdGroupCriterionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_AdGroupCriterion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_AdGroupCriterion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_AdGroupCriterion_QualityInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_AdGroupCriterion_QualityInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_AdGroupCriterion_PositionEstimates_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_AdGroupCriterion_PositionEstimates_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v1/resources/ad_g" +
      "roup_criterion.proto\022!google.ads.googlea" +
      "ds.v1.resources\032-google/ads/googleads/v1" +
      "/common/criteria.proto\0325google/ads/googl" +
      "eads/v1/common/custom_parameter.proto\032Fg" +
      "oogle/ads/googleads/v1/enums/ad_group_cr" +
      "iterion_approval_status.proto\032=google/ad" +
      "s/googleads/v1/enums/ad_group_criterion_" +
      "status.proto\0322google/ads/googleads/v1/en" +
      "ums/bidding_source.proto\032Cgoogle/ads/goo" +
      "gleads/v1/enums/criterion_system_serving" +
      "_status.proto\0322google/ads/googleads/v1/e" +
      "nums/criterion_type.proto\0328google/ads/go" +
      "ogleads/v1/enums/quality_score_bucket.pr" +
      "oto\032\036google/protobuf/wrappers.proto\032\034goo" +
      "gle/api/annotations.proto\"\221 \n\020AdGroupCri" +
      "terion\022\025\n\rresource_name\030\001 \001(\t\0221\n\014criteri" +
      "on_id\030\032 \001(\0132\033.google.protobuf.Int64Value" +
      "\022`\n\006status\030\003 \001(\0162P.google.ads.googleads." +
      "v1.enums.AdGroupCriterionStatusEnum.AdGr" +
      "oupCriterionStatus\022U\n\014quality_info\030\004 \001(\013" +
      "2?.google.ads.googleads.v1.resources.AdG" +
      "roupCriterion.QualityInfo\022.\n\010ad_group\030\005 " +
      "\001(\0132\034.google.protobuf.StringValue\022L\n\004typ" +
      "e\030\031 \001(\0162>.google.ads.googleads.v1.enums." +
      "CriterionTypeEnum.CriterionType\022,\n\010negat" +
      "ive\030\037 \001(\0132\032.google.protobuf.BoolValue\022{\n" +
      "\025system_serving_status\0304 \001(\0162\\.google.ad" +
      "s.googleads.v1.enums.CriterionSystemServ" +
      "ingStatusEnum.CriterionSystemServingStat" +
      "us\022y\n\017approval_status\0305 \001(\0162`.google.ads" +
      ".googleads.v1.enums.AdGroupCriterionAppr" +
      "ovalStatusEnum.AdGroupCriterionApprovalS" +
      "tatus\0222\n\014bid_modifier\030, \001(\0132\034.google.pro" +
      "tobuf.DoubleValue\0223\n\016cpc_bid_micros\030\020 \001(" +
      "\0132\033.google.protobuf.Int64Value\0223\n\016cpm_bi" +
      "d_micros\030\021 \001(\0132\033.google.protobuf.Int64Va" +
      "lue\0223\n\016cpv_bid_micros\030\030 \001(\0132\033.google.pro" +
      "tobuf.Int64Value\022;\n\026percent_cpc_bid_micr" +
      "os\030! \001(\0132\033.google.protobuf.Int64Value\022=\n" +
      "\030effective_cpc_bid_micros\030\022 \001(\0132\033.google" +
      ".protobuf.Int64Value\022=\n\030effective_cpm_bi" +
      "d_micros\030\023 \001(\0132\033.google.protobuf.Int64Va" +
      "lue\022=\n\030effective_cpv_bid_micros\030\024 \001(\0132\033." +
      "google.protobuf.Int64Value\022E\n effective_" +
      "percent_cpc_bid_micros\030\" \001(\0132\033.google.pr" +
      "otobuf.Int64Value\022`\n\030effective_cpc_bid_s" +
      "ource\030\025 \001(\0162>.google.ads.googleads.v1.en" +
      "ums.BiddingSourceEnum.BiddingSource\022`\n\030e" +
      "ffective_cpm_bid_source\030\026 \001(\0162>.google.a" +
      "ds.googleads.v1.enums.BiddingSourceEnum." +
      "BiddingSource\022`\n\030effective_cpv_bid_sourc" +
      "e\030\027 \001(\0162>.google.ads.googleads.v1.enums." +
      "BiddingSourceEnum.BiddingSource\022h\n effec" +
      "tive_percent_cpc_bid_source\030# \001(\0162>.goog" +
      "le.ads.googleads.v1.enums.BiddingSourceE" +
      "num.BiddingSource\022a\n\022position_estimates\030" +
      "\n \001(\0132E.google.ads.googleads.v1.resource" +
      "s.AdGroupCriterion.PositionEstimates\0220\n\n" +
      "final_urls\030\013 \003(\0132\034.google.protobuf.Strin" +
      "gValue\0227\n\021final_mobile_urls\0303 \003(\0132\034.goog" +
      "le.protobuf.StringValue\0226\n\020final_url_suf" +
      "fix\0302 \001(\0132\034.google.protobuf.StringValue\022" +
      ";\n\025tracking_url_template\030\r \001(\0132\034.google." +
      "protobuf.StringValue\022N\n\025url_custom_param" +
      "eters\030\016 \003(\0132/.google.ads.googleads.v1.co" +
      "mmon.CustomParameter\022>\n\007keyword\030\033 \001(\0132+." +
      "google.ads.googleads.v1.common.KeywordIn" +
      "foH\000\022B\n\tplacement\030\034 \001(\0132-.google.ads.goo" +
      "gleads.v1.common.PlacementInfoH\000\022T\n\023mobi" +
      "le_app_category\030\035 \001(\01325.google.ads.googl" +
      "eads.v1.common.MobileAppCategoryInfoH\000\022S" +
      "\n\022mobile_application\030\036 \001(\01325.google.ads." +
      "googleads.v1.common.MobileApplicationInf" +
      "oH\000\022I\n\rlisting_group\030  \001(\01320.google.ads." +
      "googleads.v1.common.ListingGroupInfoH\000\022A" +
      "\n\tage_range\030$ \001(\0132,.google.ads.googleads" +
      ".v1.common.AgeRangeInfoH\000\022<\n\006gender\030% \001(" +
      "\0132*.google.ads.googleads.v1.common.Gende" +
      "rInfoH\000\022G\n\014income_range\030& \001(\0132/.google.a" +
      "ds.googleads.v1.common.IncomeRangeInfoH\000" +
      "\022M\n\017parental_status\030\' \001(\01322.google.ads.g" +
      "oogleads.v1.common.ParentalStatusInfoH\000\022" +
      "A\n\tuser_list\030* \001(\0132,.google.ads.googlead" +
      "s.v1.common.UserListInfoH\000\022I\n\ryoutube_vi" +
      "deo\030( \001(\01320.google.ads.googleads.v1.comm" +
      "on.YouTubeVideoInfoH\000\022M\n\017youtube_channel" +
      "\030) \001(\01322.google.ads.googleads.v1.common." +
      "YouTubeChannelInfoH\000\022:\n\005topic\030+ \001(\0132).go" +
      "ogle.ads.googleads.v1.common.TopicInfoH\000" +
      "\022I\n\ruser_interest\030- \001(\01320.google.ads.goo" +
      "gleads.v1.common.UserInterestInfoH\000\022>\n\007w" +
      "ebpage\030. \001(\0132+.google.ads.googleads.v1.c" +
      "ommon.WebpageInfoH\000\022P\n\021app_payment_model" +
      "\030/ \001(\01323.google.ads.googleads.v1.common." +
      "AppPaymentModelInfoH\000\022M\n\017custom_affinity" +
      "\0300 \001(\01322.google.ads.googleads.v1.common." +
      "CustomAffinityInfoH\000\022I\n\rcustom_intent\0301 " +
      "\001(\01320.google.ads.googleads.v1.common.Cus" +
      "tomIntentInfoH\000\032\377\002\n\013QualityInfo\0222\n\rquali" +
      "ty_score\030\001 \001(\0132\033.google.protobuf.Int32Va" +
      "lue\022h\n\026creative_quality_score\030\002 \001(\0162H.go" +
      "ogle.ads.googleads.v1.enums.QualityScore" +
      "BucketEnum.QualityScoreBucket\022j\n\030post_cl" +
      "ick_quality_score\030\003 \001(\0162H.google.ads.goo" +
      "gleads.v1.enums.QualityScoreBucketEnum.Q" +
      "ualityScoreBucket\022f\n\024search_predicted_ct" +
      "r\030\004 \001(\0162H.google.ads.googleads.v1.enums." +
      "QualityScoreBucketEnum.QualityScoreBucke" +
      "t\032\354\002\n\021PositionEstimates\022:\n\025first_page_cp" +
      "c_micros\030\001 \001(\0132\033.google.protobuf.Int64Va" +
      "lue\022>\n\031first_position_cpc_micros\030\002 \001(\0132\033" +
      ".google.protobuf.Int64Value\022;\n\026top_of_pa" +
      "ge_cpc_micros\030\003 \001(\0132\033.google.protobuf.In" +
      "t64Value\022O\n*estimated_add_clicks_at_firs" +
      "t_position_cpc\030\004 \001(\0132\033.google.protobuf.I" +
      "nt64Value\022M\n(estimated_add_cost_at_first" +
      "_position_cpc\030\005 \001(\0132\033.google.protobuf.In" +
      "t64ValueB\013\n\tcriterionB\202\002\n%com.google.ads" +
      ".googleads.v1.resourcesB\025AdGroupCriterio" +
      "nProtoP\001ZJgoogle.golang.org/genproto/goo" +
      "gleapis/ads/googleads/v1/resources;resou" +
      "rces\242\002\003GAA\252\002!Google.Ads.GoogleAds.V1.Res" +
      "ources\312\002!Google\\Ads\\GoogleAds\\V1\\Resourc" +
      "es\352\002%Google::Ads::GoogleAds::V1::Resourc" +
      "esb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v1.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.AdGroupCriterionApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.AdGroupCriterionStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.BiddingSourceProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.CriterionSystemServingStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.CriterionTypeProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.QualityScoreBucketProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_resources_AdGroupCriterion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_AdGroupCriterion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_AdGroupCriterion_descriptor,
        new java.lang.String[] { "ResourceName", "CriterionId", "Status", "QualityInfo", "AdGroup", "Type", "Negative", "SystemServingStatus", "ApprovalStatus", "BidModifier", "CpcBidMicros", "CpmBidMicros", "CpvBidMicros", "PercentCpcBidMicros", "EffectiveCpcBidMicros", "EffectiveCpmBidMicros", "EffectiveCpvBidMicros", "EffectivePercentCpcBidMicros", "EffectiveCpcBidSource", "EffectiveCpmBidSource", "EffectiveCpvBidSource", "EffectivePercentCpcBidSource", "PositionEstimates", "FinalUrls", "FinalMobileUrls", "FinalUrlSuffix", "TrackingUrlTemplate", "UrlCustomParameters", "Keyword", "Placement", "MobileAppCategory", "MobileApplication", "ListingGroup", "AgeRange", "Gender", "IncomeRange", "ParentalStatus", "UserList", "YoutubeVideo", "YoutubeChannel", "Topic", "UserInterest", "Webpage", "AppPaymentModel", "CustomAffinity", "CustomIntent", "Criterion", });
    internal_static_google_ads_googleads_v1_resources_AdGroupCriterion_QualityInfo_descriptor =
      internal_static_google_ads_googleads_v1_resources_AdGroupCriterion_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_AdGroupCriterion_QualityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_AdGroupCriterion_QualityInfo_descriptor,
        new java.lang.String[] { "QualityScore", "CreativeQualityScore", "PostClickQualityScore", "SearchPredictedCtr", });
    internal_static_google_ads_googleads_v1_resources_AdGroupCriterion_PositionEstimates_descriptor =
      internal_static_google_ads_googleads_v1_resources_AdGroupCriterion_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v1_resources_AdGroupCriterion_PositionEstimates_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_AdGroupCriterion_PositionEstimates_descriptor,
        new java.lang.String[] { "FirstPageCpcMicros", "FirstPositionCpcMicros", "TopOfPageCpcMicros", "EstimatedAddClicksAtFirstPositionCpc", "EstimatedAddCostAtFirstPositionCpc", });
    com.google.ads.googleads.v1.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v1.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v1.enums.AdGroupCriterionApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.AdGroupCriterionStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.BiddingSourceProto.getDescriptor();
    com.google.ads.googleads.v1.enums.CriterionSystemServingStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.CriterionTypeProto.getDescriptor();
    com.google.ads.googleads.v1.enums.QualityScoreBucketProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
