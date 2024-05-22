package br.com.arthuraugustin.app_capy

import android.annotation.SuppressLint
import android.net.wifi.hotspot2.pps.HomeSp
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import br.com.arthuraugustin.app_capy.ui.theme.App_CapyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            App_CapyTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Home()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Spacer(modifier = Modifier.width(155.dp))
                        Text(stringResource(R.string.app_name))
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF)// ARRUMARRR A COR
                )
            )
            Spacer(Modifier.height(1.dp))
        }
    ) { paddingValues ->
        Column(
            Modifier.padding(
                vertical = paddingValues.calculateTopPadding(),
                horizontal = 42.dp
            ).fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.image_2),
                contentDescription = "",
                modifier = Modifier.size(230.dp),
            )
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                ),
                modifier = Modifier.fillMaxSize()
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        stringResource(R.string.title_register_screen),
                        modifier = Modifier.padding(16.dp),
                        textAlign = TextAlign.Center,
                    )
                    OutlinedTextField(
                        value = "", // Valor do TextField
                        onValueChange = {}, // Função chamada quando o valor do TextField é alterado
                        label = { Text(stringResource(R.string.input_email)) } // Rótulo do TextField
                    )
                    Spacer(Modifier.height(40.dp))
                    OutlinedTextField(
                        value = "", // Valor do TextField
                        onValueChange = {}, // Função chamada quando o valor do TextField é alterado
                        label = { Text(stringResource(R.string.input_password)) } // Rótulo do TextField
                    )
                    Spacer(Modifier.height(40.dp))
                    OutlinedTextField(
                        value = "", // Valor do TextField
                        onValueChange = {}, // Função chamada quando o valor do TextField é alterado
                        label = { Text(stringResource(R.string.input_repeat_password)) } // Rótulo do TextField
                    )
                    Spacer(Modifier.height(40.dp))
                    Button(onClick = { }) {
                        Text(stringResource(R.string.button_enter))
                    }
                }
            }

        }

    }

}
