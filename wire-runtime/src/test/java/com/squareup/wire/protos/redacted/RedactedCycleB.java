// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/redacted_test.proto
package com.squareup.wire.protos.redacted;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RedactedCycleB extends Message {

  @ProtoField(tag = 1)
  public final RedactedCycleA a;

  public RedactedCycleB(RedactedCycleA a) {
    this.a = a;
  }

  private RedactedCycleB(Builder builder) {
    this(builder.a);
    setBuilder(builder);
  }

  @Override
  public String getMessageName() {
    return "squareup.protos.redacted_test.RedactedCycleB";
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RedactedCycleB)) return false;
    return equals(a, ((RedactedCycleB) other).a);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = a != null ? a.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<RedactedCycleB> {

    public RedactedCycleA a;

    public Builder() {
    }

    public Builder(RedactedCycleB message) {
      super(message);
      if (message == null) return;
      this.a = message.a;
    }

    public Builder a(RedactedCycleA a) {
      this.a = a;
      return this;
    }

    @Override
    public RedactedCycleB build() {
      return new RedactedCycleB(this);
    }
  }
}
