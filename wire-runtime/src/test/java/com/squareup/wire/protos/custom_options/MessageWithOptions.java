// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/custom_options.proto
package com.squareup.wire.protos.custom_options;

import com.google.protobuf.MessageOptions;
import com.squareup.wire.Message;
import com.squareup.wire.protos.foreign.Ext_foreign;
import com.squareup.wire.protos.foreign.ForeignMessage;

public final class MessageWithOptions extends Message {

  public static final MessageOptions MESSAGE_OPTIONS = new MessageOptions.Builder()
      .setExtension(Ext_custom_options.my_message_option_one, new FooBar.Builder()
          .foo(1234)
          .bar("5678")
          .baz(new FooBar.Nested.Builder()
              .value(FooBar.FooBarBazEnum.BAZ)
              .build())
          .qux(-1L)
          .fred(java.util.Arrays.asList(
              123.0F,
              321.0F))
          .daisy(456.0D)
          .build())
      .setExtension(Ext_custom_options.my_message_option_two, 91011.0F)
      .setExtension(Ext_custom_options.my_message_option_three, new FooBar.Builder()
          .foo(11)
          .bar("22")
          .baz(new FooBar.Nested.Builder()
              .value(FooBar.FooBarBazEnum.BAR)
              .build())
          .fred(java.util.Arrays.asList(
              444.0F,
              555.0F))
          .nested(java.util.Arrays.asList(new FooBar.Builder()
              .foo(33)
              .fred(java.util.Arrays.asList(
                  100.0F,
                  200.0F))
              .build()))
          .build())
      .setExtension(Ext_custom_options.my_message_option_four, FooBar.FooBarBazEnum.FOO)
      .setExtension(Ext_foreign.foreign_message_option, new ForeignMessage.Builder()
          .i(9876)
          .build())
      .setExtension(Ext_custom_options.my_message_option_five, new FooBar.Builder()
          .setExtension(Ext_custom_options.ext, FooBar.FooBarBazEnum.BAZ)
          .setExtension(Ext_custom_options.rep, java.util.Arrays.asList(
              FooBar.FooBarBazEnum.FOO,
              FooBar.FooBarBazEnum.BAZ))
          .build())
      .setExtension(Ext_custom_options.my_message_option_six, new FooBar.Builder()
          .setExtension(Ext_custom_options.rep, java.util.Arrays.asList(
              FooBar.FooBarBazEnum.FOO,
              FooBar.FooBarBazEnum.BAR))
          .nested(java.util.Arrays.asList(
              new FooBar.Builder()
                  .foo(44)
                  .setExtension(Ext_custom_options.ext, FooBar.FooBarBazEnum.BAR)
                  .build(),
              new FooBar.Builder()
                  .foo(55)
                  .build()))
          .build())
      .build();

  public MessageWithOptions() {
  }

  private MessageWithOptions(Builder builder) {
    setBuilder(builder);
  }

  @Override
  public String getMessageName() {
    return "squareup.protos.custom_options.MessageWithOptions";
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof MessageWithOptions;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public static final class Builder extends Message.Builder<MessageWithOptions> {

    public Builder() {
    }

    public Builder(MessageWithOptions message) {
      super(message);
    }

    @Override
    public MessageWithOptions build() {
      return new MessageWithOptions(this);
    }
  }
}
