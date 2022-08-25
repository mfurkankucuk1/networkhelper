# networkhelper


*Helper Class


					 fun hasInternetConnection(context: Context): Boolean {
							val connectivityManager =
									context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
							if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
									val activeNetwork = connectivityManager.activeNetwork ?: return false
									val capabilities =
											connectivityManager.getNetworkCapabilities(activeNetwork) ?: return false
									return when {
											capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
											capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
											capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
											else -> false
									}
							} else {
									connectivityManager.activeNetworkInfo?.run {
											return when (type) {
													ConnectivityManager.TYPE_WIFI -> true
													ConnectivityManager.TYPE_MOBILE -> true
													ConnectivityManager.TYPE_ETHERNET -> true
													else -> false
											}
									}
							}
							return false
					}
      
 *How to use
 
 
         if (NetworkHelper.hasInternetConnection(this)){
              // there is an internet connection do something
          }else{
              // no Internet connection do something
          }




**/// Library

[![](https://jitpack.io/v/mfurkankucuk1/networkhelper.svg)](https://jitpack.io/#mfurkankucuk1/networkhelper)
