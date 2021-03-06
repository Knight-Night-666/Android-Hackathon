// Generated by view binder compiler. Do not edit!
package com.knightnight.login_and_stuff.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.knightnight.login_and_stuff.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final Button gotoLogin;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final EditText regMail;

  @NonNull
  public final EditText regName;

  @NonNull
  public final EditText regPwd;

  @NonNull
  public final Button registerBtn;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardView,
      @NonNull Button gotoLogin, @NonNull ImageView imageView, @NonNull EditText regMail,
      @NonNull EditText regName, @NonNull EditText regPwd, @NonNull Button registerBtn) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.gotoLogin = gotoLogin;
    this.imageView = imageView;
    this.regMail = regMail;
    this.regName = regName;
    this.regPwd = regPwd;
    this.registerBtn = registerBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.gotoLogin;
      Button gotoLogin = ViewBindings.findChildViewById(rootView, id);
      if (gotoLogin == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.regMail;
      EditText regMail = ViewBindings.findChildViewById(rootView, id);
      if (regMail == null) {
        break missingId;
      }

      id = R.id.regName;
      EditText regName = ViewBindings.findChildViewById(rootView, id);
      if (regName == null) {
        break missingId;
      }

      id = R.id.regPwd;
      EditText regPwd = ViewBindings.findChildViewById(rootView, id);
      if (regPwd == null) {
        break missingId;
      }

      id = R.id.registerBtn;
      Button registerBtn = ViewBindings.findChildViewById(rootView, id);
      if (registerBtn == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, cardView, gotoLogin,
          imageView, regMail, regName, regPwd, registerBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
