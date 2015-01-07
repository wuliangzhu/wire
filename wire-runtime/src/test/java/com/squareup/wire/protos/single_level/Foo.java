// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/single_level.proto
package com.squareup.wire.protos.single_level;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;

public final class Foo extends Message {

  public static final Integer DEFAULT_BAR = 0;

  @ProtoField(tag = 1, type = INT32)
  public final Integer bar;

  public Foo(Integer bar) {
    this.bar = bar;
  }

  private Foo(Builder builder) {
    this(builder.bar);
    setBuilder(builder);
  }

  @Override
  public String getMessageName() {
    return "single_level.Foo";
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Foo)) return false;
    return equals(bar, ((Foo) other).bar);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = bar != null ? bar.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<Foo> {

    public Integer bar;

    public Builder() {
    }

    public Builder(Foo message) {
      super(message);
      if (message == null) return;
      this.bar = message.bar;
    }

    public Builder bar(Integer bar) {
      this.bar = bar;
      return this;
    }

    @Override
    public Foo build() {
      return new Foo(this);
    }
  }
}
