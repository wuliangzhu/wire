// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/roots.proto
package com.squareup.wire.protos.roots;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/**
 * Used to test --roots flag of WireCompiler
 *
 * A -> B -> C
 *  \
 *   -> D
 *
 * E -> E.F
 *  \
 *   -> G
 *
 * H -> E.F
 *
 * I -> nothing
 */
public final class A extends Message {

  @ProtoField(tag = 1)
  public final B c;

  @ProtoField(tag = 2)
  public final D d;

  public A(B c, D d) {
    this.c = c;
    this.d = d;
  }

  private A(Builder builder) {
    this(builder.c, builder.d);
    setBuilder(builder);
  }

  @Override
  public String getMessageName() {
    return "squareup.protos.roots.A";
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof A)) return false;
    A o = (A) other;
    return equals(c, o.c)
        && equals(d, o.d);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = c != null ? c.hashCode() : 0;
      result = result * 37 + (d != null ? d.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<A> {

    public B c;
    public D d;

    public Builder() {
    }

    public Builder(A message) {
      super(message);
      if (message == null) return;
      this.c = message.c;
      this.d = message.d;
    }

    public Builder c(B c) {
      this.c = c;
      return this;
    }

    public Builder d(D d) {
      this.d = d;
      return this;
    }

    @Override
    public A build() {
      return new A(this);
    }
  }
}
