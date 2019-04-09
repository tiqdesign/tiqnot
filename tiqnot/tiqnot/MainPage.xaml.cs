using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Plugin.LocalNotifications;
using Xamarin.Forms;

namespace tiqnot
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
        }

        private int count = 0;
        private string notif;
        private void Btn_add_OnClicked(object sender, EventArgs e)
        {
            notif = tb_notif.Text;

            if (String.IsNullOrWhiteSpace(notif))
            {
                this.DisplayAlert("Hata", "Lütfen alanı boş bırakmayın!", "Tamam");
            }
            else
            {
                if (Application.Current.Properties.ContainsKey("count"))
                {
                    string countS = Application.Current.Properties["count"].ToString();
                    count = int.Parse(countS);
                    count++;
                    CrossLocalNotifications.Current.Show("tiqnot", tb_notif.Text, count);
                    Application.Current.Properties["count"] = count;
                }
                else
                {
                    Application.Current.Properties["count"] = 0;
                    CrossLocalNotifications.Current.Show("tiqnot", tb_notif.Text, count);
                }
                
            }

            tb_notif.Text = "";
        }
    }
}
