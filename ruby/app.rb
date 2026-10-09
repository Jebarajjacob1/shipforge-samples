require "sinatra/base"

# The ShipForge Ruby sample.
class App < Sinatra::Base
  set :host_authorization, { permitted_hosts: [] } # any address ShipForge gives it

  get "/" do
    content_type "text/plain"
    "Hello from ShipForge (Ruby)\n"
  end

  get "/health" do
    content_type "text/plain"
    "ok\n"
  end
end
