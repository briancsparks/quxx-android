package net.cdr0.quxx.services.background.perintent

import android.content.Context
import android.content.Intent
import android.os.Bundle

class FooBarSendToService {

  public fun send(context: Context) {
    val bundle = Bundle()
    bundle.putString("key", "value")

    Intent(context, FooBarService::class.java).also { intent ->
      intent.putExtras(bundle)
      context.startService(intent)
    }
  }

}
