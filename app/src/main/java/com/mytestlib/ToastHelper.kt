package com.mytestlib

import android.content.Context
import android.content.Intent
import android.net.Uri


class ToastHelper {

    companion object {
        fun openUrl(context: Context) {

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://api.staging.app.dapperlabs.com/hydra/oauth2/auth?client_id=1884963a-576b-45d6-9fa7-e37cc0da7d84&state=iK2zDuP0_9bZWZrdIgOd4wlyC5-ABOgLQH8lWxb1UJ4&response_type=code&scope=openid%20email%20offline%20app.dapperlabs.com/eth.wallet.read&redirect_uri=com.dapper.oauth-example://oauth2/callback"))
            context.startActivity(intent)

        }
    }
}