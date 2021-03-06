// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/customer_client_link_service.proto

package com.google.ads.googleads.v1.services;

public final class CustomerClientLinkServiceProto {
  private CustomerClientLinkServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetCustomerClientLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetCustomerClientLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateCustomerClientLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateCustomerClientLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_CustomerClientLinkOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_CustomerClientLinkOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateCustomerClientLinkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateCustomerClientLinkResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateCustomerClientLinkResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateCustomerClientLinkResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v1/services/custo" +
      "mer_client_link_service.proto\022 google.ad" +
      "s.googleads.v1.services\032<google/ads/goog" +
      "leads/v1/resources/customer_client_link." +
      "proto\032\034google/api/annotations.proto\032 goo" +
      "gle/protobuf/field_mask.proto\032\036google/pr" +
      "otobuf/wrappers.proto\"5\n\034GetCustomerClie" +
      "ntLinkRequest\022\025\n\rresource_name\030\001 \001(\t\"\210\001\n" +
      "\037MutateCustomerClientLinkRequest\022\023\n\013cust" +
      "omer_id\030\001 \001(\t\022P\n\toperation\030\002 \001(\0132=.googl" +
      "e.ads.googleads.v1.services.CustomerClie" +
      "ntLinkOperation\"\355\001\n\033CustomerClientLinkOp" +
      "eration\022/\n\013update_mask\030\004 \001(\0132\032.google.pr" +
      "otobuf.FieldMask\022G\n\006create\030\001 \001(\01325.googl" +
      "e.ads.googleads.v1.resources.CustomerCli" +
      "entLinkH\000\022G\n\006update\030\002 \001(\01325.google.ads.g" +
      "oogleads.v1.resources.CustomerClientLink" +
      "H\000B\013\n\toperation\"t\n MutateCustomerClientL" +
      "inkResponse\022P\n\006result\030\001 \001(\0132@.google.ads" +
      ".googleads.v1.services.MutateCustomerCli" +
      "entLinkResult\"7\n\036MutateCustomerClientLin" +
      "kResult\022\025\n\rresource_name\030\001 \001(\t2\324\003\n\031Custo" +
      "merClientLinkService\022\315\001\n\025GetCustomerClie" +
      "ntLink\022>.google.ads.googleads.v1.service" +
      "s.GetCustomerClientLinkRequest\0325.google." +
      "ads.googleads.v1.resources.CustomerClien" +
      "tLink\"=\202\323\344\223\0027\0225/v1/{resource_name=custom" +
      "ers/*/customerClientLinks/*}\022\346\001\n\030MutateC" +
      "ustomerClientLink\022A.google.ads.googleads" +
      ".v1.services.MutateCustomerClientLinkReq" +
      "uest\032B.google.ads.googleads.v1.services." +
      "MutateCustomerClientLinkResponse\"C\202\323\344\223\002=" +
      "\"8/v1/customers/{customer_id=*}/customer" +
      "ClientLinks:mutate:\001*B\205\002\n$com.google.ads" +
      ".googleads.v1.servicesB\036CustomerClientLi" +
      "nkServiceProtoP\001ZHgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v1/service" +
      "s;services\242\002\003GAA\252\002 Google.Ads.GoogleAds." +
      "V1.Services\312\002 Google\\Ads\\GoogleAds\\V1\\Se" +
      "rvices\352\002$Google::Ads::GoogleAds::V1::Ser" +
      "vicesb\006proto3"
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
          com.google.ads.googleads.v1.resources.CustomerClientLinkProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetCustomerClientLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetCustomerClientLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetCustomerClientLinkRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateCustomerClientLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateCustomerClientLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateCustomerClientLinkRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", });
    internal_static_google_ads_googleads_v1_services_CustomerClientLinkOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_CustomerClientLinkOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_CustomerClientLinkOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateCustomerClientLinkResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateCustomerClientLinkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateCustomerClientLinkResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v1_services_MutateCustomerClientLinkResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateCustomerClientLinkResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateCustomerClientLinkResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.CustomerClientLinkProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
